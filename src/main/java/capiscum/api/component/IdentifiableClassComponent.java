package capiscum.api.component;

/**
 * Represents a class that identifies itself, as a component and can compare itself to other
 * components.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public interface IdentifiableClassComponent<V> {

    /**
     * Identifies, whether the component is a match.
     * @param component
     * @return
     */
    boolean identify(Component<V> component);

}
