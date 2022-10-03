/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author zacca
 */
public class Validation {

    /**
     * validation class
     */
   public static boolean isNumeric(String param) {
        for (int i = 0; i < param.length(); i++) {
            if (!Character.isDigit(param.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    //Checks if an input is numeric and falls within a given range
    public static boolean isValid(String param, int lowerLimit, int upperLimit) {
        int val;

        try {

            val = Integer.parseInt(param);

        } catch (NumberFormatException e) {
            return false;
        }

        if (val < lowerLimit || val > upperLimit) {
            return false;
        } else {
            return true;
        }
    }
}
