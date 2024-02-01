public abstract class AbstractAnimalFactory {
    protected abstract Animal factoryMethod();
    public Animal getAnimalType() {
        return factoryMethod();
    }
}
class CatFactory extends AbstractAnimalFactory {
    protected Animal factoryMethod() {
        return new Cat();
    }
    // getAnimalType
}
class DogFactory extends AbstractAnimalFactory {
    protected Animal factoryMethod() {
        return new Dog();
    }
    // getAnimalType
}

