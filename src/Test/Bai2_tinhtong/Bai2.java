package Test.Bai2_tinhtong;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên dương: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += i;
        }

        System.out.print("Tổng các số chẵn từ 0 đến " + n + " là: " +sum);
    }
}
