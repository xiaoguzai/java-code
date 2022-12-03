package javase_chapter3;

/***
 * 动态初始化多维数组
 * int[][] arr = new int[3][];
 * arr[0] = new int[3];
 * arr[1] = new int[1];
 * arr[2] = new int[2];
 */
public class chaper_3_space_deep_copy {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        array2 = array1.clone();
        for(int i=0;i<array2.length;i++)
        {
            array2[i] = i;
        }
        System.out.println("array1 = ");
        for(int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i]);
        }
        //array1={0,1,2,3,4,5,6,7}
        //原因：array1和array2指向同一片内存空间
    }
}
