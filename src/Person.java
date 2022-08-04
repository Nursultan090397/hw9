public class Person {
    public String name;
    public double weight;
    public int age;
    public String citizenship;
    public Laptop laptop = new Laptop ();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                ", citizenship='" + citizenship + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}
