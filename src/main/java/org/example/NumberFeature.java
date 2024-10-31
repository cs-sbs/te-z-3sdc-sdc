package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0; // 输出结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt();
        // 你的代码逻辑
         scanner.close();

        int result = 0;
        int binaryValue = 1; // 从个位开始，二进制值的权重，初始为1（2^0）
        int position = 1; // 位置编号，从1开始

        // 将输入数字转换为字符串，以便逐位处理
        String numberStr = Integer.toString(inputNumber);

        // 从最高位到最低位遍历
        for (int i = numberStr.length() - 1; i >= 0; i--) {
            int digit = Character.getNumericValue(numberStr.charAt(i)); // 获取当前位的数字
            boolean digitIsOdd = (digit % 2) != 0; // 判断数字是否为奇数
            boolean positionIsOdd = (position % 2) != 0; // 判断位置是否为奇数

            // 如果数字的奇偶性与位置的奇偶性相同，则记录为1（即加上当前的二进制权重值）
            if (digitIsOdd == positionIsOdd) {
                result += binaryValue;
            }

            // 更新二进制权重值（左移一位，相当于乘以2）
            binaryValue *= 2;

            // 更新位置编号
            position++;
        }

        System.out.println(result);
    }
}
