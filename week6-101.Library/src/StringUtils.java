/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dennis
 */
public class StringUtils {

    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }
        String buffedWord = word.toUpperCase().trim();
        String buffedSearch = searched.toUpperCase().trim();
        

        if (buffedWord.contains(buffedSearch)) {
            return true;
        } else {
            return false;
        }

    }

}
