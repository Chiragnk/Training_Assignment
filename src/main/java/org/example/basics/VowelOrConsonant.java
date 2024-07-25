package org.example.basics;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char input=s.next().charAt(0);
        switch(input)
        {
            case 'A':
                System.out.println("its a vowel");
                break;
            case 'E':
                System.out.println("its a vowel");
                break;
            case 'I':
                System.out.println("its a vowel");
                break;
            case 'O':
                System.out.println("its a vowel");
                break;
            case 'U':
                System.out.println("its a vowel");
                break;
            default:
                System.out.println("its a consonant");

        }
    }
}
