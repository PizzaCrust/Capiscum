package capiscum.api.component;

import java.util.Optional;

/**
 * Simple implementation of {@link Component}.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class SimpleComponent<V> implements Component<V> {

    private V value = null;

    SimpleComponent() {}

    SimpleComponent(V value) { this.value = value; }

    @Override
    public void set(V value) {
        this.value = value;
    }

    @Override
    public Optional<V> get() {
        return Optional.ofNullable(value);
    }

    @Override
    public boolean equals(Component<V> component) {
        return !(!get().isPresent() || !component.get().isPresent()) && get().equals(component.get());
    }

}
