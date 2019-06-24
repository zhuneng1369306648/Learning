package ÍøÒ×Ğ£ÕĞ;

import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(Integer.parseInt(new StringBuilder(s).reverse().toString())+Integer.parseInt(s));
        sc.close();
    }
}