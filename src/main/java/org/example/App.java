/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        String str1;
        String str2;

        System.out.println( "Enter two strings and I'll tell you if they are anagrams:" );
        System.out.println("Enter the first string:");
        str1 = scan.next();
        System.out.println("Enter the second string:");
        str2 = scan.next();

        isAnagram( str1, str2 );

        if( isAnagram(str1,str2) )
        {
            System.out.println( "\"" + str1 + "\"" + " and " + "\"" + str2 + "\"" + " are anagrams.");
        }
        else
        {
            System.out.println( "\"" + str1+ "\"" + " and " + "\""+ str2 + "\""+ " are not anagrams.");
        }

    }

    static boolean isAnagram( String str1, String str2 )
    {
        int i;

       if( str1.length() != str2.length()){
           return false;
       }

       char string1ToArray[] = str1.toCharArray();
       char string2ToArray[] = str2.toCharArray();

       Arrays.sort(string1ToArray);
       Arrays.sort(string2ToArray);

       for( i=0; i< str1.length(); i++ )
       {
           if(string1ToArray[i] != string2ToArray[i])
           {
               return false;
           }
       }
       return true;
    }
}
