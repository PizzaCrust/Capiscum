package capiscum.api.component;

import java.util.Optional;

/**
 * A capiscum.api.component is a identifiable piece of information that can be linked into another object.
 *
 * For example, a capiscum.api.component can be used to store information; such as a delegation of a
 * implementation of a API class, without directly interfacing with the class. It can be accessed
 * through a static source, compared and retrieve the class from the data in the capiscum.api.component.
 *
 * It is mutable and also, is not capable of outputting null values without forcing it.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 * @param <V> the value type of the capiscum.api.component
 */
public interface Component<V> {

    /**
     * Sets the data of the capiscum.api.component.
     * @param value
     */
    void set(V value);

    /**
     * Retrieves the stored data of the capiscum.api.component.
     * @return
     */
    Optional<V> get();

    /**
     * Determines if the capiscum.api.component specified equals another capiscum.api.component.
     * @param component
     * @return
     */
    boolean equals(Component<V> component);

    /**
     * Creates a string capiscum.api.component.
     * @param component
     * @return
     */
    static Component<String> createStringComponent(String component) {
        return new SimpleComponent<>(component);
    }

}
