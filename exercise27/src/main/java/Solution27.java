/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution27{
    /*
    * make constant scanner 'input'
    * make constant String 'data'
    * make input method to scan in strings 'inputMethod'
    * make method to iterate through input and check the validity 'checkInput'
        * set boolean variable 'first' = run 'validateFirstName' to check validity
        * set boolean variable 'last' = run 'validateLastName' to check validity
        * set boolean variable 'id' = run 'validateEmployeeID' to check validity
        * set boolean variable 'zip' = run 'validateZipCode' to check validity
        * if they all pass
            * print 'There are no errors. '
        * else print out the string for what failed
    * make method to validate firstName 'validateFirstName'
        * make sure the input is above 2 characters
            * make output print 'The first name must be at least 2 characters long. '
        * make sure there is an input
            * make output print 'The first name must be filled in. '
    * make method to validate lastName 'validateLastName'
        * make sure the input is above 2 characters
            * make output print 'The last name must be at least 2 characters long. '
        * make sure there is an input
            * make output print 'The last name must be filled in. '
    * make method to validate zipCode 'validateZipCode'
        * parse the string into integers
        * check that is it 5 in length
            * make output print 'The zipcode must be a 5 digit number. '
        * check it is digits
            * make output print 'The zipcode must be a 5 digit number. '
     * make method to validate employeeID 'validateEmployeeID'
        * make a pattern of format
        * check if the input matches pattern
            * otherwise make output print 'The employee ID must be in the format of AA-1234. '
    * main
    * make class variable sol
    * declare String 'firstName' = scan in string using 'inputMethod'
    * declare String 'lastName' = scan in string using 'inputMethod'
    * declare String 'zipCode' = scan in string using 'inputMethod'
    * declare String 'employeeID' = scan in string using 'inputMethod'
    * call 'checkInput' method to validate the credentials
    */
    /*
    * Junit 5
    * test each input checker method
    * make void test methods and hardcode input string to fail condiitons
    * compare at end 
    */

    // constant scanner
    private static final Scanner input = new Scanner(System.in);

    // constant string
    static String data = "";

    // input
    private String inputMethod(String prompt){
    }

    // check conditions
    private void checkInput(String firstName, String lastName, String zipCode, String employeeID){
    }

    // for first name conditions
    public boolean validateFirstName(String firstName){
    }

    // for last name conditions
    public boolean validateLastName(String lastName){
    }

    // for zip code conditions
    public boolean validateZipCode(String zipCode){
    }

    // for employee id conditions
    public boolean validateEmployeeID(String employeeID){
    }

    public static void main(String[] args) {

    }
}