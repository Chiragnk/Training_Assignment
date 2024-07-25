package org.example.basics;

import java.util.Scanner;

public class SumAndAverageOfWeights {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        float weight1=s.nextFloat();
        float weight2=s.nextFloat();
        float weight3=s.nextFloat();
        float sum=0,avg=0;
        sum=weight1+weight2+weight3;
        avg=sum/3;
        System.out.println("The sum of weight of 3 persons is:"+sum+" and the average weight is:"+avg);
    }
}
