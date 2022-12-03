package javase_chapter3;

import java.util.Scanner;

public class chapter_3_switch_use {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入星期值：");
        int week = input.nextInt();

        switch (week)
        {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期七");
                break;
            default:
                System.out.println("非法星期值");
                break;
        }
    }
}
