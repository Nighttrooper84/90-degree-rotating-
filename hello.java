import java.util.*;

class Hello 
{
      int a[][];
      int arr[];
      int n;
        Hello(int n)
        {
            a=new int[n][n];
            arr=new int[n*n];
            this.n=n;
        }
        void input()
        {
             Scanner ob=new Scanner(System.in);
                System.out.println("Enter the elements of the matrix:");
                for(int i=0;i<a.length;i++)
                {
                    for(int j=0;j<a[i].length;j++)
                    {
                        a[i][j]=ob.nextInt();
                    }
                }

        }
        void inarray()
        { 
            int k=0;
            int i,j;
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    arr[k++]=a[i][j];
                }
            }
        }
    public static void main(String[] args) 

    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the size of the matrix:");
        int n=ob.nextInt();
        Hello h=new Hello(n);
        h.input();
        h.inarray();
        h.display();
    }
     void display()
     {
        int i,j;
        System.out.println("The matrix is:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
     }

}