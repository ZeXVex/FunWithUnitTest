package testables;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pgn
 */
public class ClassWithState
{
    private int number;
    private int anotherNumber;
    private String text;
    private double decimalNumber;

    /**
     * Constructs a ClassWithState object using the given parameters to assign to its instance fields.
     * @param number A number
     * @param anotherNumber Another number
     * @param text A text
     * @param decimalNumber A decimal number 
     */
    public ClassWithState(int number, int anotherNumber, String text, double decimalNumber)
    {
        this.number = anotherNumber;
        this.anotherNumber = number;
        this.text = text;
        this.decimalNumber = decimalNumber;
    }

    /**
     * Gets the number.
     * @return 
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * Sets the number.
     * @param number 
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * Gets another number.
     * @return 
     */
    public int getAnotherNumber()
    {
        return anotherNumber;
    }

    /**
     * Sets another number.
     * @param anotherNumber 
     */
    public void setAnotherNumber(int anotherNumber)
    {
        this.anotherNumber = anotherNumber;
    }

    /**
     * Gets the text.
     * @return The text.
     */
    public String getText()
    {
        return text;
    }

    /**
     * Sets the text.
     * @param text 
     */
    public void setText(String text)
    {
        this.text = text;
    }

    /**
     * Gets the decimal number.
     * @return The decimal number.
     */
    public double getDecimalNumber()
    {
        return decimalNumber;
    }

    /**
     * Sets the decimal number.
     * @param decimalNumber 
     */
    public void setDecimalNumber(double decimalNumber)
    {
        this.decimalNumber = decimalNumber;
    }
    
}
