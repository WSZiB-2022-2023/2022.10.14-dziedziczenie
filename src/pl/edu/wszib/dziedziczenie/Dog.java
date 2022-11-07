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

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Dog)) {
            return false;
        }
        Dog dog = (Dog) obj;
        return this.getName().equals(dog.getName()) &&
                this.getRace().equals(dog.getRace()) &&
                this.getAge() == dog.getAge();
    }
}
