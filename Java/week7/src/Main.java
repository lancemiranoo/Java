public class Main {
    public static void main(String[] args) {
        Animal d1 = new Cat();
        d1.makeSound();
    }
}

class Animal {
    public void makeSound() {
        System.out.println("roar");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("bark");
    }
}