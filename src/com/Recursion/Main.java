package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Check that the number is power of 2 or not.

	 */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean ans = (n&(n-1))==0;
        System.out.println(ans);

    }
}
