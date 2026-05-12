package com.packages.recursivity;

import java.util.Stack;

public class Recursion
{
    public Recursion()
    {
        
    }

    public static int factorial(int n)
    {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}