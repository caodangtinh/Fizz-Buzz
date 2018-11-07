package com.tinhcao.fizzbuzz.step3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Step3 {
    public Map<String, AtomicInteger> step3(int n) {
        Map<String, AtomicInteger> report = new HashMap<>();
        report.put("fizz", new AtomicInteger());
        report.put("buzz", new AtomicInteger());
        report.put("fizzbuzz", new AtomicInteger());
        report.put("lucky", new AtomicInteger());
        report.put("integer", new AtomicInteger());

        for (int i = 1; i <= n; i++) {
            String result = String.valueOf(i);
            if (result.contains("3")) {
                System.out.print("lucky ");
                report.get("lucky").incrementAndGet();
            } else if (i % 15 == 0) {
                // number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number
                System.out.print("fizzbuzz" + " ");
                report.get("fizzbuzz").incrementAndGet();

            } else if (i % 5 == 0) {
                // number divisible by 5, print 'Buzz' in place of the number
                System.out.print("buzz" + " ");
                report.get("buzz").incrementAndGet();
            } else if (i % 3 == 0) {
                // number divisible by 3, print 'Fizz' in place of the number
                System.out.print("fizz" + " ");
                report.get("fizz").incrementAndGet();
            } else {
                // print the numbers
                System.out.print(i + " ");
                report.get("integer").incrementAndGet();
            }
        }

        // print report
        report.forEach((k, v) -> System.out.print(k + ": " + v + " "));
        return report;
    }
}
