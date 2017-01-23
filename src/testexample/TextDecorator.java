/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexample;

/**
 *
 * @author Jeppe
 */
public class TextDecorator {
    /**
     * Can convert any sequence of letters to uppercase.
     *
     * @param input input to be converted to uppercase. Any character is a valid input.
     */
    public String allCaps(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int c = (int) input.charAt(i);
            int count = 0;
            if(c > 96 && c<123)
            while (count < 32) {
                c--;
                count++;
            }
            output += ((char) c);
        }
        return output;
    }
    
    /**
     * Can convert any sequence of letters to lowercase.
     *
     * @param input input to be converted to lowercase. Any character is a valid input.
     */
    public String allLower(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int c = (int) input.charAt(i);
            int count = 0;
            if(c > 64 && c<91)
            while (count < 32) {
                c++;
                count++;
            }
            output += ((char) c);
        }
        return output;
    }
     /**
     * Can convert any sequence of letters to every second letter uppercase and the others converted to lowercase.
     *
     * @param input input to be converted to interleaved upper and lowercase. Any character is a valid input.
     */
    public String allUpperLower(String input) 
    {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int c = (int) input.charAt(i);
            int count = 0;
            if(i%2==0)
            {
                if(c > 64 && c<91)
                while (count < 32) {
                    c++;
                    count++;
                }
            }
            else
            {
                if(c > 96 && c<123)
                    while (count < 32) {
                        c--;
                        count++;
                    }
            }
            output += ((char) c);
        }
        return output;
    }
}
