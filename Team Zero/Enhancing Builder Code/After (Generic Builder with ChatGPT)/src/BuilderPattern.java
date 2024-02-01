import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
public class BuilderPattern<T> {
    private final Supplier<T> instantiator;
    private List<Consumer<T>> modifiers = new ArrayList<>();

    public BuilderPattern(Supplier<T> instantiator) {
        this.instantiator = instantiator;
    }

    public static <T> BuilderPattern<T> of(Supplier<T> instantiator) {
        return new BuilderPattern<>(instantiator);
    }

    public <U> BuilderPattern<T> with(BiConsumer<T, U> consumer, U value) {
        Consumer<T> c = instance -> consumer.accept(instance, value);
        modifiers.add(c);
        return this;
    }

    public T build() {
        T value = instantiator.get();
        modifiers.forEach(modifier -> modifier.accept(value));
        modifiers.clear();
        return value;
    }
}