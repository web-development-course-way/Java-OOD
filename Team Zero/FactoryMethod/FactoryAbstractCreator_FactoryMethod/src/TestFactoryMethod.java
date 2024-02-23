public class TestFactoryMethod {
    public static void main(String[] args) {
        Animal animal1 = new CatFactory().getAnimalType();
        animal1.makeSound();

        Animal animal2 = new DogFactory().getAnimalType();
        animal2.makeSound();
    }
}

