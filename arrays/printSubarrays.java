package arrays;
public class printSubarrays
{
    public static void main(String[] args) {

    int[] arr = {1,1,0,0,1,1,0,1,0,1};
    int maxlen=0;
    for(int i=0;i<arr.length;i++)
    {  int count=0;
        for(int j=i;j<arr.length;j++)
        {
            if(arr[j]==0)
            {
                count++;
            }
            if(count<=2)
            {
                int len = j-i+1;
                maxlen = Math.max(len,maxlen);
            }
        }
    }
        System.out.println(maxlen);
    }
}