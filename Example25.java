import java.util.Scanner;
import java.util.Arrays;
class Example25{
    void merge(int a[],int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[]=new int[n2];
        int i,j,k;
        for(i=0;i<n1;i++)
            L[i]=a[l+i];
        for(j=0;j<n2;j++)
            R[j]=a[m+1+j];
        i=0;j=0;k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            {
                a[k]=L[i];
                i++;
            }
            else{
                a[k]=R[j];
                j++;
            }
            k++;
        }
        while(i<n1)
        {
            a[k]=L[i];
                i++;
                k++;
        }
        while(j<n2)
        {
            a[k]=R[j];
            j++;
            k++;   
        }
    }


    void sort(int a[],int l,int r)
    {
        if(l<r){
            int m=(l+r)/2;
            sort(a,l,m);
            sort(a,m+1,r);
            merge(a,l,m,r);
        }
    }
    
    static void printArray(int a[],int n){
        for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] s)
    {
       int[] a= new int[]{232,49,454,51,100,97};
       printArray(a,a.length);
       Example25 e=new Example25();
       System.out.println();
       e.sort(a,0,a.length-1);
       System.out.println("the sorted array is:");
       printArray(a,a.length);
    }
}