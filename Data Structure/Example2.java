//demonstrating 2darrays in java
public class Example2 {
    public static void main(String[] args)
    {
        int[][] a=new int[][]{{1,2,3},{4,5,6}};
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println("the element at index "+i+j+": "+a[i][j]);
            }
        }
    }
}