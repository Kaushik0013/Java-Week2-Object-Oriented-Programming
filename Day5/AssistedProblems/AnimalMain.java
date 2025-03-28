class Animal {
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    void makeSound(){
        System.out.println(name+"makes a sound");
    }
}
class Dog extends Animal{
        Dog(String name, int age){
            super(name, age);
        }
        @Override
        void makeSound(){
            System.out.println(name+" barks: Woof Woof!");
        }
}

class Cat extends Animal{
    Cat(String name, int age){
        super(name, age);
    }
    @Override 
    void makeSound(){
        System.out.println(name+" meows:meow meow ");
    }
}

class Bird extends Animal{
    Bird(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name+" chirps: Tweet Tweet");
    }
}

public class AnimalMain{
    public static void main(String[]args){
        Animal a = new Dog("Bolt",4);
        Animal b = new Cat("Bond",30);
        Animal c = new Bird("Xavier", 7);

        a.makeSound();
        b.makeSound();
        c.makeSound();
    }
}