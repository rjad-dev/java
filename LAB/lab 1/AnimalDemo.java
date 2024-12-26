public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.makeSound();
        dog.move();

        bird.makeSound();
        bird.move();
    }
}

abstract class Animal {
    public abstract void makeSound();

    public abstract void move();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog runs");
    }
}

class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird flies");
    }
}