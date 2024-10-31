package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑

        digital_eigenvalue(inputNumber, result);


    }

    public static void digital_eigenvalue(int inputNumber, int result) {
        int number;
        int digit_position = 1;
        int binary_bit_value = 1;
        while (inputNumber > 0) {
            number = inputNumber % 10;
            inputNumber = inputNumber / 10;
            if (number % 2 == digit_position % 2)
                result += binary_bit_value;
            binary_bit_value *= 2;
            digit_position++;
        }
        System.out.println(result);
    }
}
