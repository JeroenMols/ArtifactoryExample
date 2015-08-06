package com.jeroenmols.awesomelibrary;

/**
 * Created by Jeroen Mols on 06/08/15.
 */
public class AwesomeConvertor {

    public static String toAwesome(String nonAwesomeString) {
        return nonAwesomeString.replaceAll("\\w+", "Awesome!");
    }
}
