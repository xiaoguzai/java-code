package javase_chapter3;

//题目：创建一个长为6的int数组，要求取值1~30，同时元素值各不相同
public class chapter_3_practice1_simple_matrix_use {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Boolean flag;
        for(int i=0;i<arr.length;)
        {
            int data = (int) (Math.random()*30);
            flag = Boolean.FALSE;
            for(int j=0;j<i;j++)
            {
                if(data == arr[j])
                {
                    flag = Boolean.TRUE;
                }
            }
            if(flag.equals(Boolean.FALSE))
            {
                arr[i] = data;
                i++;
            }
        }

        System.out.println("The result is");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
