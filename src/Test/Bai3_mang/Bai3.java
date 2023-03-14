package Test.Bai3_mang;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập mảng gồm 50 phần tử: ");
        int num = input.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) Math.round(100 * Math.random());
        }
        //hien thi mang
        System.out.println("Mảng là: " + Arrays.toString(arr));
        //gia tri lon nhat
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.print("Max: " + max + "\n");
        //gia tri nho nhat
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.print("Min: " + min + "\n");
        //sap xep theo thu tu tang dan
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        //dem so nguyen to
        int snt = 0;
        boolean check = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2) {
                check = false;
            } else {
                int count = 2;
                check = true;
                while (count <= Math.sqrt(arr[i])) {
                    if (arr[i] % count == 0) {
                        check = false;
                    }
                    count++;
                }
                if (check) {
                    snt++;
                }
            }
        }
        System.out.println("Có " + snt + " Số nguyên tố ");
    }

}
