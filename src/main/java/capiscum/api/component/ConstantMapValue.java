package capiscum.api.component;

import java.util.Map;
import java.util.Optional;

import javafx.util.Pair;

/**
 * Represents a value for a map, however in a final variable.
 * This allows mutable access for changes in the map, however
 * the variable cannot be changed from external sources.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class ConstantMapValue<V> {

    private final Map<Component<V>, Component<V>> map;
    private Component<V> value;

    public ConstantMapValue(Map<Component<V>, Component<V>> map, Component<V> initValue) {
        if (initValue == null) throw new RuntimeException("Init value is null!");
        this.value = initValue;
        this.map = map;
    }

    private Pair<Boolean, Optional<Component<V>>> containsKey(Component<V> component) {
        for (Map.Entry<Component<V>, Component<V>> componentComponentEntry : map.entrySet()) {
            if (componentComponentEntry.getKey().equals(component)) {
                return new Pair<>(true, Optional.of(componentComponentEntry.getValue()));
            }
        }
        return new Pair<>(false, Optional.empty());
    }

    public Component<V> getValue() {
        Pair<Boolean, Optional<Component<V>>> pair = containsKey(this.value);
        if (pair.getKey().equals(Boolean.TRUE)) {
            return pair.getValue().get();
        }
        return value;
    }

}
