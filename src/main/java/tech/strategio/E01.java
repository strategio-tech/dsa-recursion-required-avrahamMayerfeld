package tech.strategio;

import java.util.*;

public class E01 {


    public int getNthFib(int n) {
        int[] fib = new int[n + 1];
        if(n == 1)
        {
            fib[n] = 0;
        }
        if(n == 2)
        {
            fib[n] = 1;
        }
        if(fib[n] == 0 && n > 2)
        {
            fib[n] = getNthFib(n-1) + getNthFib(n-2);
            return fib[n];
        }
        return fib[n];
    }
}
