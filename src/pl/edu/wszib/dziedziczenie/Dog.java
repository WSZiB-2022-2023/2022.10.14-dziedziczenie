package pl.edu.wszib.dziedziczenie;

public class Dog extends Pet {
    private int dodatkowaRzecz;

    public Dog() {
        super("reksio", "cos", 30);
        System.out.println("Konstruktor psa !!!");
    }

    public int getDodatkowaRzecz() {
        return dodatkowaRzecz;
    }

    public void setDodatkowaRzecz(int dodatkowaRzecz) {
        this.dodatkowaRzecz = dodatkowaRzecz;
    }
}
