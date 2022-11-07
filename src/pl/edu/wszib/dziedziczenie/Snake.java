package pl.edu.wszib.dziedziczenie;

public class Snake extends Pet {
    public Snake(String name, String race, int age) {
        super(name, race, age);
    }

    @Override
    public void walk() {
        System.out.println("Ide i nie mam lap !!");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Snake{");
        sb.append("name=")
                .append(this.getName())
                .append(", race=")
                .append(this.getRace())
                .append(", age=")
                .append(this.getAge())
                .append('}');
        return sb.toString();
    }
}
