package leetcodeDaily;

import java.util.*;

public class SmallestDivDig2 {
    private Map<Long, Integer> primeFactors(Long n) {
        Map<Long, Integer> pf = new HashMap<>();
        while (n % 2 == 0) {
            pf.put(2L, pf.getOrDefault(2L, 0) + 1);
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                pf.put(i, pf.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n > 1) {
            pf.put(n, pf.getOrDefault(n, 0) + 1);
        }
        return pf;
    }
    private long smallestNum(Map<Long, Integer> primeFactors){

    }
    public String smallestNumber(String num, long t) {
      Map<Long, Integer> primeFactors = primeFactors(t);
        for (long prime : primeFactors.keySet()) {
            if (prime > 7) {
                return "-1";
            }
        }


    }
}
