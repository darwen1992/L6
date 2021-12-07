package org.example;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        int []x={7,2,9,4,5,6,1,8,3};
        System.out.println("Main array ");
        for(int name: x) {
            System.out.print(name+" " );
        }
        System.out.println();
        System.out.println("__________________________ ");

        findNumber( x);
        System.out.println("__________________________ ");

        evenNumber( x );
        System.out.println("__________________________ ");

        sum( x);
        System.out.println("__________________________ ");

        revers( x );
        System.out.println("__________________________ ");

        sort( x );
        System.out.println("__________________________ ");
    }


   static void findNumber( int[] x )
    {
        int indexFound = Arrays.binarySearch(x,5);
        System.out.println("index of the number is "+ indexFound);
    }

    static void evenNumber( int[] x )
    {
        for (int i=0; i< x.length;i++){
           if(x[i]%2==0){
               System.out.print( x[i]+" " );
           }
        }
        System.out.println();
    }

    static void sum( int[] x )
    {
        int sum=0;
        for (int i=0; i< x.length;i++){
            sum=sum+x[i];

            }

        System.out.print("sum= " +sum);
        System.out.println();
    }

    static void revers( int[] x )
    {

        for (int i=x.length-1; i>=0;i--){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }

    static void sort( int[] x )
    {
        Arrays.sort(x);
        for(int i: x) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
