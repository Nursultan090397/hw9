public class Laptop {
    public int memory;
    public String brand;
    public String colour;
    public String model;
    public double weight;
    public String owner;
    public int ram;
    public int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "memory=" + memory +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", owner='" + owner + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}
