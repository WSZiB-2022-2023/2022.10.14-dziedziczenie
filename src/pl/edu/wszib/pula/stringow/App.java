package pl.edu.wszib.pula.stringow;

import pl.edu.wszib.dziedziczenie.Dog;

public class App {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println(a == b);

        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setRace("Kundel");
        dog.setAge(10);
        dog.setDodatkowaRzecz(5);

        Dog dog2 = new Dog();
        dog2.setName("Reksio");
        dog2.setRace("Kundel");
        dog2.setAge(10);
        dog2.setDodatkowaRzecz(5);

        //Dog dog2 = dog;

        System.out.println(dog.equals(dog2));

        String s1 = "ABC";
        String s2 = "ABC";

        System.out.println(s1);
        System.out.println(s2);

        s1 = s1 + "XYZ";

        System.out.println(s1);
        System.out.println(s2);

        s2 = s1 + s2;

        System.out.println(s2);

        for(int i = 0; i < 10; i++) {
            System.out.println("petla");
        }

        int i = 5;

        if(true) {
            int g = 6;
        }

        int g = 10;
    }
}
