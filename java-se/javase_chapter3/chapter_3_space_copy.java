package javase_chapter3;

public class chapter_3_space_copy {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        array2 = array1;
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
