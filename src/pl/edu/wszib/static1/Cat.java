package pl.edu.wszib.static1;

public class Cat {
    public static String name;
    public String race;

    public final int age;

    static {
        System.out.println("coś się dzieje !!");
    }

    public Cat() {
        this.age = 8;
    }

    public Cat(String race) {
        this.race = race;
        this.age = 8;
    }

    public final void cos() {

    }
}
