package src.compareTo;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------ String CompareTo() ------------");
        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2));

        String myStr3 = "Hlelo";
        String myStr4 = "Hello";
        System.out.println(myStr3.compareTo(myStr4));

        String myStr5 = "Helo";
        String myStr6 = "Hello";
        System.out.println(myStr5.compareTo(myStr6));
        System.out.println("------------ String CompareTo() ------------");

        System.out.println("------------ Integer CompareTo() ------------");
        Integer myInteger1 = 1;
        Integer myInteger2 = 2;
        System.out.println(myInteger1.compareTo(myInteger2));

        Integer myInteger3 = 1;
        Integer myInteger4 = 1;
        System.out.println(myInteger3.compareTo(myInteger4));

        Integer myInteger5 = 5;
        Integer myInteger6 = 1;
        System.out.println(myInteger5.compareTo(myInteger6));
        System.out.println("------------ Integer CompareTo() ------------");

        System.out.println("------------ IntegerList CompareTo() ------------");

        TreeSet treeSet = new TreeSet();
    }
}
