package capiscum.api.component;

/**
 * Represents a immutable component.
 *
 * @since 1.0-SNAPSHOT
 * @author PizzaCrust
 */
public class ImmutableComponent<V> extends SimpleComponent<V> {

    ImmutableComponent(Component<V> component) {
        super(component.get().get());
    }

    public static <V> ImmutableComponent<V> immutableOf(Component<V> component) {
        return new ImmutableComponent<V>(component);
    }

    @Override
    public void set(V value) {}

}
