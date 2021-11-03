package samples.week5.usemoreclasses;


/*
      The concept of a Car with an owner (a Person!)

      This is a small OO model i.e. objects referencing
      other (concept) objects to build a model (abstraction) of the problem
      at hand
 */
public class Car {

    private String brand;
    private final String id;
    private int modelYear;
    private double milage;
    private Person owner;       // Reference to other concept!

    // Constructor
    public Car(String brand, String id, int modelYear, double milage, Person owner) {
        this.brand = brand;
        this.id = id;
        this.modelYear = modelYear;
        this.milage = milage;
        this.owner = owner;  // Connect this with other object
    }

    // Overloaded constructor. Possible don't know owner!
    public Car(String brand, String id, int modelYear, double milage) {
        this(brand, id, modelYear, milage, null);
    }

    // Overloaded constructor. Possible just know id
    public Car(String id) {
        this("", id, 0,  0, null);
    }

    public Person getOwner() {
        return owner;
    }

    // Setter and getters omitted, NOTE: Just add setters/getters if needed!
    // May be generated by IntelliJ

}