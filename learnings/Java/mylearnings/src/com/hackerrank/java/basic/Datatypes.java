package com.hackerrank.java.basic;
import java.util.Scanner;
/**
 * input datatype fit check
 */
public class Datatypes {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) System.out.println("* byte");
                if(x>=-(Short.MAX_VALUE+1)&&x<=Short.MAX_VALUE) System.out.println("* short");
                if(x>=-(Integer.MAX_VALUE+1)&&x<=Integer.MAX_VALUE) System.out.println("* int");
                if(x>=-(Long.MAX_VALUE+1)&&x<=Long.MAX_VALUE) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
