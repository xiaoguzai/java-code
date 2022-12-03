package javase_chapter3;

import java.util.Scanner;

public class chapter_3_practice2_rotate_matrix {
    /***
     * 回形数格式方阵
     * 输入一个数值，对于数组螺旋形赋值
     * 比如输入数值2，输出
     * 1 2
     * 4 3
     * 输入数值3，输出
     * 1 2 3
     * 8 9 4
     * 7 6 5
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int n = input.nextInt();
        int matrix[][] = new int[n][n];
        int lefts = 0,rights = n-1;
        int up = 0,down = n-1;
        int data = 1;
        int curx = 0,cury = 0;

        while(lefts <= rights&&up <= down) {
            while (cury <= rights) {
                matrix[curx][cury] = data;
                cury++;
                data++;
            }
            cury--;
            up++;
            curx++;
            if(data > n*n)
            {
                break;
            }

            while (curx <= down) {
                matrix[curx][cury] = data;
                curx++;
                data++;
            }
            curx--;
            rights--;
            cury--;
            if(data > n*n)
            {
                break;
            }

            while (cury >= lefts) {
                matrix[curx][cury] = data;
                cury--;
                data++;
            }
            cury++;
            curx--;
            down--;
            if(data > n*n)
            {
                break;
            }

            while (curx >= up) {
                matrix[curx][cury] = data;
                curx--;
                data++;
            }
            curx++;
            cury++;
            lefts++;
            if(data > n*n)
            {
                break;
            }
        }

        System.out.println("最终结果为");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("运行完毕");
    }
}

/**
 * 补充题目
 * 下列数组定义正确的有
 * A.String strs[] = {'a','b','c'}
 * B.String[] strs = {"a","b","c"}
 * C.String[] strs = new String{"a","b","c"}
 * D.String strs[] = new String[]{"a","b","c"}
 * E.String[] strs = new String[3]{"a","b","c"}
 * B.D,结论：要么加上new String[]，要么啥也不带
 */