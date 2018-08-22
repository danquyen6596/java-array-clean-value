package vn.codegym.QuyenLeSy;

import java.util.Scanner;

public class CleanValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        int[] m={2,5,6,7,8,2,4};
        int[] temp = new int[m.length];
        int len = m.length;
        int j = 0;
        System.out.print("Nhập vào giá trị cần xóa: ");
        value = scanner.nextInt();

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < m.length; i++)
        {
            System.out.printf("%d\t", m[i]);
            if(m[i] == value){
                len--;
            }
            else{
                temp[j] = m[i];
                j++;
            }
        }

        m = new int[len];
        System.out.print("\nMảng sau khi xóa phần tử "+value+": ");
        for (int n = 0; n < len; n++)
        {
            m[n] = temp[n];
            System.out.printf("%d\t", m[n]);
        }
    }
}