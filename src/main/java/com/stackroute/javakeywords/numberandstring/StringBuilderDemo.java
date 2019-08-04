package com.stackroute.javakeywords.numberandstring;

public class StringBuilderDemo {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Hello ");
        //now original string is changed
        sb.append("Java");
        //prints Hello Java
        System.out.println(sb);
        //now original string is changed
        sb.insert(1, "Java");
        //prints HJavaello
        System.out.println(sb);
        sb.replace(1, 3, "Java");
        //prints HJavalo
        System.out.println(sb);
        sb.delete(1, 3);
        //prints Hlo
        System.out.println(sb);
        //prints olleH
        sb.reverse();
        System.out.println(sb);
    }
}
