public interface Animal {
    void makeSound();
}
class Cat implements Animal {
    public void makeSound() {
        System.out.println("Meow-Meow");
    }
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Oof-Oof");
    }
}

