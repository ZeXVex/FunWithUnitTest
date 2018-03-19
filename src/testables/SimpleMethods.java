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
public class SimpleMethods {

    /**
     * Checks to see if a is bigger than b!
     *
     * @param a The integer A.
     * @param b The integer B.
     * @return True if A is bigger than b.
     */
    public boolean isABiggerThanB(int a, int b) {
        return (b > a);
    }

    /**
     * Checks to see if the char c is present in the string text.
     *
     * @param c The char to look for.
     * @param text The text to look in.
     * @return True if c is present.
     */
    public boolean isCharInString(char c, String text) {
        return text.contains(c + " ");
    }

    /**
     * Will return the result of a divided with b.
     *
     * @param a Double a
     * @param b Double b
     * @return The division of a with b.
     */
    public double division(double a, double b) {
        return a / b;
    }

    /**
     * Counts how many occurences of X we have in the given array.
     *
     * @param x The integer to search for.
     * @param arr The array to search in.
     * @return The amount of occurences.
     */
    public int occurncesOfXInArr(int x, int[] arr) {
        int c = 0;
        int i = 0;
        while (true) {
            if (i >= arr.length - 1) {
                break;
            }
            else if (arr[i] == x) {
                c++;
            }
            i++;
        }
        return c;
    }

    /**
     * Will check to see if an array contains doubles of any of its elements. By
     * invoking the "equals" method.
     *
     * @param arr The array to look through.
     * @return True if any one element is present twice.
     */
    public boolean hasDoubles(Object[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    return true;
                }
            }
        }
        return false;
    }

}
