package pl.edu.wszib.static1;

public class App {
    public static void main(String[] args) {
        System.out.println("anc");
        System.out.println("anc");
        System.out.println("anc");
        System.out.println("anc");
        System.out.println("anc");

        Cat cat1 = new Cat();

        System.out.println(Cat.name);
        System.out.println(cat1.race);

        Cat.name = "Puszek";
        cat1.race = "Brytyjski";

        System.out.println(Cat.name);
        System.out.println(cat1.race);

        Cat cat2 = new Cat();

        System.out.println(Cat.name);
        System.out.println(cat2.race);

        Cat.name = "Mruczek";
        cat2.race = "Dachowiec";

        System.out.println(Cat.name);
        System.out.println(cat2.race);

        System.out.println(Cat.name);
        System.out.println(cat1.race);

        System.out.println(Math.PI);

        System.out.println("-------------------------------------------");

        final int i = 5;
        System.out.println(i);

        //i = 7;

        final Cat c = new Cat("Rosyjski");
        System.out.println(c.race);

        c.race = "Inna";

        System.out.println(c.race);

        //c = new Cat();

        //Cat c2 = new Cat();
        //c = c2;
    }
}
