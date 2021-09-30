/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24{
    /*
    * declare constant scanner 'input'
    * make an input method to take in and return the strings 'inputMethod'
    * make an output method for case 1, they are not anagrams 'outMethod'
    * make an output method for case 2, they are anagrams 'outMethod2'
    * make a method that takes in the 2 strings and compares them 'isAnagram'
        * redeclare 'string1' and 'string2'
        * make sure they are same length otherwise they aren't anagrams
        * declare a boolean variable 'status'
        * if('string1' length != 'string2' length)
            * automatically set 'status' = false
        * otherwise
            * make an array for string1 all lower case for comparison 'Str1'
            * make an array for string2 all lower case for comparison 'Str2'
            * sort both arrays 'Str1' & 'Str2'
            * set status to their comparison
       * return 'status'
    * main method
    * create a class variable 'sol'
    * print 'Enter two strings and I'll tell you if they are anagrams: '
    * declare string variable 'string1' = scan in using 'inputMethod'
    * declare string variable 'string2' = scan in using 'inputMethod'
    * if ( 'isAnagram' 'status' return true )
        * print output for case 2 using 'outputMethod2'
    * else
        * print output for case 1 using 'outputMethod'
     */

    /*
     * Junit 5 Testing:
     * test isAnagrams method
     * make sure the method handles strings correctly
     * if they are anagrams return true otherwise
     * expected to return false
     */
    public static void main(String[] args) {

    }
}