/*
 * Robert Hill
 * 01.04.19
 * SetCard.java
 * Summary:
 * SetCard extends Card class to represents a playing card
 * in Set card game
 */
package cards;

/**
 * SetCard extends Card class
 * to represents a playing card
 * in Set card game
 * @author Rob The King!
 * @version 1.0
 */
public class SetCard extends Card {
//    fields
    private String shape;
    private int number;
    private String shading;
    private String color;

//    constructors

    /**
     * Constructor to instantiate the SetCard object type
     * creates a new card for the Set Game given
     * a number, shape, shade and color.
     * @param shape String data type to represent the suite
     *              of the SetCard object
     * @param number Primitive integer data type to represent the rank
     *               of the SetCard object
     * @param shading String data type to represent the shade
     *                of the SetCard object
     * @param color String data type to represent the color of the
     *              SetCard object
     */
    public SetCard(String shape, int number, String shading,
                   String color) {
        super(color +" "+ shading +"-"+color+" "+ number);
        this.shape = shape;
        this.number = number;
        this.shading = shading;
        this.color = color;
    }
//    accessors

    /**
     * Getter for the attribute of a card from the Set Game
     * @return String data type to represent the shape
     * of the Set Card type object
     *
     */
    public String getShape() { return shape; }

    /**
     * Getter for the attribute of a card from the Set Game
     * @return primitive integer data type to represent the rank
     * of the Set Card type object
     *
     */
    public int getNumber() { return number; }

    /**
     * Getter for the attribute of a card from the Set Game
     * @return String data type to represent the shading
     * of the Set Card type object
     *
     */
    public String getShading() { return shading; }

    /**
     * Getter for the attribute of a card from the Set Game
     * @return String data type to represent the color
     * of the Set Card type object
     *
     */
    public String getColor() { return color; }
//    mutator
//    toString

    @Override
    public String toString() {
        return super.toString();
    }
}

