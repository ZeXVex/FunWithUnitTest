/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testables;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pgn
 */
public class SingletonModel
{

    /**
     * The static variable that holds the singleton object of this class.
     */
    private static SingletonModel INSTANCE;

    private List<String> naughtyWords;

    /**
     * The method to access and create the instance of this singleton.
     *
     * @return The singleton object of this class.
     */
    public static synchronized SingletonModel getInstance()
    {
        if (INSTANCE == null)
        {
            INSTANCE = new SingletonModel();
        }
        return INSTANCE;
    }

    /**
     * The private constructor of this class. It's private so to prevent
     * instantiation outside of the scope of this class.
     */
    private SingletonModel()
    {
        this.naughtyWords = new ArrayList<>();
    }

    /**
     * Adds a naughty word to the end of the list.
     *
     * @param naughtyWord
     */
    public void addNaughtyWord(String naughtyWord)
    {
        naughtyWords.add(naughtyWord);
    }

    /**
     * Adds many naughty words to the list of naughty words.
     *
     * @param manyNaughtyWords The many naughty words.
     */
    public void addManyNaughtyWords(String... manyNaughtyWords)
    {
        for (String naughtyWord : manyNaughtyWords)
        {
            naughtyWords.add(naughtyWord);
        }
    }

    /**
     * Will add two naughty words to the class, or only one if they are the same.
     * @param aNaughtyWord The first naughty word to add.
     * @param bNaughtyWord The second naughty word to add.
     */
    public void addOneOrTwoNaughtyWords(String aNaughtyWord, String bNaughtyWord)
    {
        if (aNaughtyWord.equalsIgnoreCase(bNaughtyWord))
        {
            addNaughtyWord(aNaughtyWord);
        } else
        {
            addManyNaughtyWords(aNaughtyWord, bNaughtyWord);
        }
    }

    /**
     * Returns the count of naughty words in the list.
     *
     * @return
     */
    public int getNumberOfNaughtyWords()
    {
        return naughtyWords.size();
    }

    /**
     * Removes the first of the naughty words.
     */
    public void removeFirstNaughtyWord()
    {
        if (!naughtyWords.isEmpty())
        {
            naughtyWords.remove(0);
        }
    }

    /**
     * Gets the first of the naughty words.
     *
     * @return
     */
    public String getFirstNaughtyWord()
    {
        if (!naughtyWords.isEmpty())
        {
            return naughtyWords.get(0);
        } else
        {
            throw new RuntimeException("No more naughty words :-(");
        }
    }

    /**
     * Checks to see if the list of naughty words is empty.
     *
     * @return
     */
    public boolean isListOfNaughtyWordsEmpty()
    {
        return naughtyWords.isEmpty();
    }

}
