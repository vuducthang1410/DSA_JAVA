package ZigzagConversion;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Solution1 sl1=new Solution1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to be converted : ");
        String value=sc.nextLine();
        System.out.println("enter the line number : ");
        int lineRow=sc.nextInt();
        System.out.println(sl1.convert(value,lineRow));
    }
}
