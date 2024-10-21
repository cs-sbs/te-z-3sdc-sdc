package org.example;
import java.util.Scanner;

public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;

        System.out.println("请输入一系列正整数，输入-1表示结束：");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(oddCount + " " + evenCount);

        scanner.close();
    }
}