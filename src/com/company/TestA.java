package com.company;

/**
 * Created by Sony on 19.03.2015.
 */
public class TestA {
    public static void main( String[] asw){
        int a = 3;
        int b = 4;
        String op = "*";

        if (op.equals("+")) {
            System.out.println( "a+b ="+(a+b));
        }else if ("-".equals (op)) {
            System.out.println("a-b =" + (a - b));
        } else if ("/".equals(op)) {
            System.out.println ("a/b=" + (a / b));
        }else if ("*".equals (op)){
            System.out.println("a*b="  + (a*b));
        }else {
            System.out.println ("invalid operator");
        }


    }
}
