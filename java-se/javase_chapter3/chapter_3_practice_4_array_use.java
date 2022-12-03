package javase_chapter3;

import java.util.Arrays;
import java.util.Scanner;

/***
 * 练习：
 * 1、从键盘输入本组学员的成绩，放到数组中
 * 2、用for循环显示所有学员的成绩
 * 3、排序：从低到高
 * 4、查找是否有正好60分的，如果有返回位置
 * 5、复制成绩最低三名构成新数组
 * 6、用工具类打印成绩最低三名成绩
 *
 * 补充：String类型转为Int类型的操作
 * String a = "43";int i=Integer.parseInt(a);
 */

public class chapter_3_practice_4_array_use {
    public static void main(String[] args){
        //1、声明一个数组并创建一个数组
        int[] scores = new int[5];

        //2、从键盘输入成绩
        Scanner input = new Scanner(System.in);
        for(int i=0; i<scores.length; i++){
            //成绩存在数组的元素中
            //为元素赋值
            System.out.print("请输入第" + (i+1) + "个学员的成绩:");
            scores[i] = input.nextInt();
        }

        //3、显示成绩
        //用foreach显示所有学员的成绩
        System.out.println("本组学员的成绩如下：");
        for(int s = 0; s < scores.length;s++){
            System.out.println(scores[s]);
        }
        //4、排序：从低到高
        Arrays.sort(scores);

        System.out.println("排序后的结果：" + Arrays.toString(scores));

        //5、查找60分
        int index = Arrays.binarySearch(scores, 60);
        if(index<0){
            System.out.println("没有正好60分的");
        }else{
            System.out.println("60分的索引位置：" + index);
        }

        //6、复制成绩最低三名构成新数组
        //int[] newArray = Arrays.copyOfRange(scores, 0, 3);
        int[] newArray = Arrays.copyOf(scores,  3);

        //7、用工具类打印成绩最低三名成绩
        System.out.println("成绩最低的三名同学是：" +  Arrays.toString(newArray));
    }
}
