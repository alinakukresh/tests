package com.company;

/**
 * sort array on string length
 */
public class task2arraySort {
    public static void main(String[]argh) {
        String[] strings = new String[5];
        strings[0] = "Mishka the dog";
        strings[1] = "Jessica the cat";
        strings[2] = "Jel the fish";
        strings[3] = "aaa";
        strings[4] = "bb";

        for ( int i = strings.length-1;i>0;i-- ){
            for(int m = 0; m < i; m++){
                if (strings[m].length()>strings[m+1].length()){
                    String tmp = strings[m];
                    strings[m] = strings[m+1];
                    strings[m+1]= tmp;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(i + " "+strings[i].length()+" " + strings[i] );
        }

    }

}
