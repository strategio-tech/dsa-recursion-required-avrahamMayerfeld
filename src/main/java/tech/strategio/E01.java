package tech.strategio;

import java.util.*;

public class E01 {


    public int getNthFib(int n) {
        int[] fib = new int[n + 1];
        if(n == 1)
        {
            fib[n] = 0;
            return fib[n];
        }
        if(n == 2)
        {
            fib[n] = 1;
            return fib[n];
        }

        if(fib[n] != 0)
            return fib[n];
        else if (n > 2)
        {
            fib[n] = getNthFib[n-1] + getNthFib[n-2];
            return fib[n];
        }
    }
}
