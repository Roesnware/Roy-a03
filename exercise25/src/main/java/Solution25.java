/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution25 {
    /*
    * make constant scanner variable 'input'
    * make input method to get password 'inputMethod'
    * make output method to print out output cases 'outMethod'
    * make boolean method 'checkDigits'
        * return 'true' if 'password' is all digits and < 8
        * else return 'false'
    * make boolean method 'checkLetters'
        * return 'true' if 'password' is all letters and < 8
        * else return 'false'
    * make boolean method 'checkDigLet'
        * return 'true' if the 'password' has numbers, and letters and is >= 8
        * else return 'false'
    * make boolean method 'checkAll'
        * return 'true' if the 'password' has special char, numbers, and letters and is >= 8
        * else return 'false'
    * make integer method 'passwordValidator'
        * return the 'val' corresponding to 'strength' of 'password'
    * make method for getting 'strength' value from 'passwordValidator' to specify output case 'getStrength'
        * run each condition and return relative strength {1-4} 4 being the very strong and 1 being very weak
    * main method
    * declare a class variable 'sol'
    * declare string 'password' = scan string input using 'inputMethod'
    * run 'outputMethod' to complete task and get output
    */
    /*
     * Junit 5 test
     * make boolean method 'checkDigits'
        * return 'true' if 'password' is all digits and < 8
        * make string == 123456789 should be false too many characters
     * make boolean method 'checkLetters'
        * return 'true' if 'password' is all letters and < 8
        * make string == abcd12 should be false numbers in password
     * make boolean method 'checkDigLet'
        * return 'true' if the 'password' has numbers, and letters and is >= 8
        * make string == abcd!12345 should be false special character
     * make boolean method 'checkAll'
        * return 'true' if the 'password' has special char, numbers, and letters and is >= 8
        * make string == abcd! should be false to little characters
     */
    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // input
    private String inputMethod(){}

    // 1 form of output
    private void outputMethod(String password, String strength){}

    // method condition for dig
    public boolean checkDigits(String password, int passLen) {}

    // method condition for letters
    public boolean checkLetters(String password, int passLen){}

    // method condition for num and letters
    public boolean checkDigLet(String password, int passLen){}

    // method condition for special char
    public boolean checkAll(String password, int passLen){}

    // for strength output
    public int passwordValidator(String password){}

    // for strength output
    public String getStrength(String password){}

    // main
    public static void main(String[] args) {}
}
