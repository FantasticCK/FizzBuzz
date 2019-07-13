package com.CK;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 20;
        Solution solution = new Solution();
        System.out.println(solution.fizzBuzz(n).toString());
    }
}

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        if (n < 1) return res;
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0)
                res.add("FizzBuzz");
            else if (i % 3 == 0)
                res.add("Fizz");
            else if (i % 5 == 0)
                res.add("Buzz");
            else res.add(Integer.toString(i));

        }
        return res;
    }
}
