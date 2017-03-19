package capiscum.api.component;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents native types to Minecraft, this allows to create a component-based
 * system to compare generic types of objects.
 *
 * All components in the class are immutable, and can only be set by the implementation.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class Types {

    /**
     * API friendly names, into class names.
     * Default construction of types are usually, "player" for the player field, and if
     * the map contains a better version; it will take that.
     */
    private static final Map<Component<String>, Component<String>> IMPLEMENTATION_MAP = new
            HashMap<>();

    /**
     * Sets the implementation map, if empty.
     * @param implementationMap
     */
    public static void setImplementationMap(Map<Component<String>, Component<String>> implementationMap) {
        if (IMPLEMENTATION_MAP.isEmpty()) {
            IMPLEMENTATION_MAP.putAll(implementationMap);
        }
    }

    /**
     * Creates a component delegation to the implementation map.
     * @param string
     * @return
     */
    private static ConstantMapValue<String> createStringDelegation(String string) {
        return new ConstantMapValue<>(IMPLEMENTATION_MAP, ImmutableComponent.immutableOf(Component
                .createStringComponent
                (string)));
    }

    /**
     * Retrieves the reflection-implementation based (possible, class) name of the server.
     */
    public static final ConstantMapValue<String> SERVER = createStringDelegation("server");

}
