package pl.edu.wszib.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("puszek", "brytyjski", 10);

        System.out.println(cat1.getName());
        System.out.println(cat1.getRace());
        System.out.println(cat1.getAge());

        Dog dog1 = new Dog();
        dog1.setName("reksio");
        dog1.setRace("kundel");
        dog1.setAge(10);
        dog1.setDodatkowaRzecz(40);

        System.out.println(dog1.getName());
        System.out.println(dog1.getRace());
        System.out.println(dog1.getAge());

        A a = new A();
        a.cos();

        Dog d1 = new Dog();
        Pet p1 = new Dog();
        Object o1 = new Dog();

        Dog[] dogs = new Dog[10];
        Cat[] cats = new Cat[10];

        Pet[] pets = new Pet[10];
        pets[0] = new Dog();
        pets[1] = new Cat("puszek", "brytyjski", 10);

        if(pets[0] instanceof Dog) {
            Dog jakisPies = (Dog) pets[0];
            jakisPies.setDodatkowaRzecz(19);
            jakisPies.walk();
        }

        if(pets[1] instanceof Cat) {
            Cat jakisKot = (Cat) pets[1];
            jakisKot.walk();
        }

        Snake snake = new Snake("pyton", "Ptyon", 10);
        snake.walk();

        Pet pet = new Snake("pyton", "Ptyon", 10);
        pet.walk();
    }
}
