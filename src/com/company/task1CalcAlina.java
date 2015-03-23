package com.company;

public class task1CalcAlina {

    public static void main(String[] args) throws Exception  {
        byte[] entry = new byte[20];
        System.out.println("Enter number a and press enter ");
        System.in.read(entry);
        int a  = Integer.parseInt(new String(entry).trim());

        entry = new byte[20];
        System.out.println ("Enter operator +,-,* or / and press enter");
        System.in.read(entry);
        String op = new String(entry).trim();


        entry = new byte[20];
        System.out.println("Enter number b and press enter");
        System.in.read (entry);
        int b  = Integer.parseInt(new String(entry).trim());


        if (op.equals("+") ) {
            System.out.println("a+b =" + (a +b) );
        } else if ("-".equals(op)){
            System.out.println("a-b =" + (a-b));
        }else if ("/".equals(op)){
            System.out.println ("a/b =" + (a/b));
        }else if ("*".equals(op)){
            System.out.println("a*b=" + (a*b));
        }else {
            System.out.println ( "Unknown operator. Please, refine your entry.");
        }
		
		
    }
}


