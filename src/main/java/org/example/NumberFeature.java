package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int result = 0;
        int position = 1; // 数位，从1开始

        // 从右向左处理数字
        while (number > 0) {
            int digit = number % 10; // 取最后一位数字
            boolean digitIsOdd = (digit % 2) != 0; // 检查数字是否为奇数
            boolean positionIsOdd = (position % 2) != 0; // 检查数位是否为奇数

            // 如果数字和数位的奇偶性相同，则在二进制表示中记下1
            if (digitIsOdd == positionIsOdd) {
                result += position; // 累加对应的二进制位值
            }

            number /= 10; // 去掉已处理的最后一位数字
            position *= 2; // 数位翻倍，准备处理下一位数字
        }
        System.out.println(result);
    }
}
