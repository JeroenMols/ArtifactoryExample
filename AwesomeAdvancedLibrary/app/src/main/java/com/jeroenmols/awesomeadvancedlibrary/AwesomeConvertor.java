package com.jeroenmols.awesomeadvancedlibrary;

import com.google.common.base.CharMatcher;

/**
 * Created by Jeroen Mols on 06/08/15.
 */
public class AwesomeConvertor {

    public static String toAwesome(String nonAwesomeString) {
        int count = CharMatcher.DIGIT.countIn(nonAwesomeString);
        return String.format("%dx Awesome!", count);
    }
}
