import java.util.*;
public class mouseCount
{
    public int Mouse(int arr[],int i,int loop,int r,int unit)
    {
        if(arr==null)
        {
            return -1;
        }
        int mult=r*unit;
        int sum=0;
        int count=0;
        for(i=0;i<loop;i++)
        {
            sum=arr[i]+sum;
            count++;
            if(sum>=mult)
            {
                break;
            }
        }
        if(mult>sum)
            return 0;
        return count;
    }
    public static void main(String args[])
    {
        mouseCount obj=new mouseCount();
        Scanner sc=new Scanner(System.in);
        int i=0;
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int loop=sc.nextInt();
        int arr[]=new int[loop];
        for(i=0;i<loop;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result=obj.Mouse(arr,i,loop,r,unit);
        System.out.println(result);
    }
}