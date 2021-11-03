package samples.week5.useaclass;

/*
    A class for Complex numbers (in it's own file Complex.java)
    In file we use access specifiers (public , private) to achieve
    information hiding.

    To test the class run TextComplex.

*/

// Class declaration. Class i public so possible to use anywhere in program
public class Complex {

    // ------ Instance variables  --------------------

    // Private variables, no one outside this class (file) can access
    private final double re;    // Immutable (final)!
    private final double img;

    // ---- Constructors --------------------

    // This is a constructor, called when using new. Used to initialize the object
    // Public means any code can call this
    public Complex(double re, double img) {
        // 'this' is a reference to the actual object.
        // We use it here to distinguish between instance variable name
        // "re" and parameter "re" (just because they have the same names)
        this.re = re;
        this.img = img;
    }

    public Complex(Complex other) {   // Another constructor, overloaded, will create copy of other.
        this(other.re, other.img);    // "this" is other constructor (matching by args)
    }

    public Complex(double re) { // Yet other constructor, for convenience
        this(re, 0);       // Call other constructor with default value for img.
    }

    // --- Instance methods ---------------

    // Always return a new Complex (because we normally assume operands won't change)
    public Complex add(Complex other) {
        return new Complex(this.re + other.re, this.img + other.img);
    }

    public Complex sub(Complex other) {
        return new Complex(this.re - other.re, this.img - other.img);
    }

    // Must use methods to access private variables (getters)
    public double getRe() {    // Possible access parts if complex
        return re;
    }

    public double getImg() {
        return img;
    }

    /*
        Below are 3 method that your classes probably should implement

        The methods are in fact present in any class, implicit inherited from the class Object
        (standard Java class). But, ...the inherited methods often doesn't behave as we wish.
        Usually we need to create own versions of the methods to replace the existing (overriding)

        NOTE : All of them can be Generated by IntelliJ, right click > Generate ...

     */
    // This is one way to implement equality between objects (by value)
    // If not adding this method you'll get equality by reference (i.e. identity)
    // If not adding this method, objects in Collections will not be found!
    @Override    // @Override shows that we wish to implement our own version (checked by compilers).
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Complex complex = (Complex) o;

        return Double.compare(complex.re, re) == 0 &&
                Double.compare(complex.img, img) == 0;

    }

    // This will give the object a fairly unique id number "the hash code"
    // Equal objects should (must) have the same hashCode
    // If not implemented, objects in Maps will not be found (if object is used as the key)
    // Don't need to understand the details, will be covered in later courses.
    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(re);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(img);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    // Create a human readable String out of an object (or parts of object)
    // This method automatically called when using out.println()
    // Otherwise used for debug.
    @Override
    public String toString() {
        if (re == 0 && img == 0) {
            return "0";
        } else if (re == 0) {
            return img + "i";
        } else if (img == 0) {
            return Double.toString(re);
        } else if (img > 0) {
            return re + " + " + (img + "i");
        } else {
            return re + " - " + (-1 * img + "i");
        }
    }
}

