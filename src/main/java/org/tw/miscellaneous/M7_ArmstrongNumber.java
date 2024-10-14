package org.tw.miscellaneous;

public class M7_ArmstrongNumber {

    // Armstrong number : 153 = (1*1*1)+(5*5*5)+(3*3*3)

    public static void main(String[] args) {
        int sum = 0;
        int a, temp;
        int num = 153;
        temp = num;
        while (num > 0) {
            a = num % 10; // 3, 5, 1
            num = num / 10; // 15, 1, 0
            sum = sum + (a * a * a); // sum = (0 + 3*3*3), (27 + 5*5*5), (152 + 1*1*1)
        }
        if (temp == sum)
            System.out.println("Armstrong number");
        else {
            System.out.println("Not armstrong number");
        }
    }

}
