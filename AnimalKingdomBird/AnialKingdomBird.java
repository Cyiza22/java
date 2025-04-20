package AnimalKingdomBird;

class Animal{
    public void makeSound() {
        System.out.println("Animal sound :");
    }
    
}
class Bird extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat() {
        System.out.println("Bird is eating");
    }
}
class Eagle extends Bird {
    
    @Override
    public void makeSound() {
        System.out.println("Screech");
    }
    public void hunt() {
        System.out.println("Eagle is hunting");
    }
}
class Dog extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }
    public void run() {
        System.out.println("Dog is running");
    }
}
class Cat extends Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
    public void scratch() {
        System.out.println("Cat is scratching");
    }
}

public class AnialKingdomBird {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        System.out.println("Bird says:");
        myBird.makeSound();
        System.out.println("Bird does:");
        myBird.fly();
        myBird.eat();

        // Eagle 
        Eagle myEagle = new Eagle();
        System.out.println("\nEagle says:");
        myEagle.makeSound();
        System.out.println("Eagle does:");
        myEagle.fly();  
        myEagle.hunt(); 

        // Dog
        Dog myDog = new Dog();
        System.out.println("\nDog says:");
        myDog.makeSound();
        System.out.println("Dog does:");
        myDog.run();

        //Cat
        Cat myCat = new Cat();
        System.out.println("\nCat says:");
        myCat.makeSound();
        System.out.println("Cat does:");
        myCat.scratch();

        // Polymorphism test
        System.out.println("Polymorphism ex");
        Animal[] animals = {myBird, myEagle, myDog, myCat};

        for (Animal a : animals) {
            a.makeSound(); 
        }
        
    }
    
}
