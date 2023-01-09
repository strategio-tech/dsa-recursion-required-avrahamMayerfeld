package tech.strategio;

import java.util.*;

public class E01 {
    public int getNthFib(int n) {
        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 0;
        fib[2] = 1;

        if(fib[n] != 0)
            return fib[n];
        else
        {
            fib[n] = fib[n-1] + fib[n-2];
            return fib[n];
        }
    }
}
