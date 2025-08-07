package RECURSION.easy;

public class rotated_bs_recursion {
    static int rotated_bs(int [] arr,int low,int high,int target)
    {

       int mid = low+(high-low)/2;
       if(arr[mid]==target){
           return mid;
       }
      if(arr[low]<=arr[mid])
       {
           if(target>=arr[low] && target<=arr[mid])
           {
               return rotated_bs(arr,low,mid-1,target);
           }
           else
               return rotated_bs(arr,mid+1,high,target);

       }
      else if(arr[mid]<=arr[high])
      {
          if(target>=arr[mid] && target<=arr[high])
          {
              return rotated_bs(arr,mid+1,high,target);
          }
           else
           {
        return rotated_bs(arr,low,mid-1,target);
           }
      }
      return -1;
    }

    public static void main(String[] args) {
        int [] arr = {5,6,7,8,0,1,2,3};
        int target = 7;
        int low =0;
        int high = arr.length-1;
        System.out.println(rotated_bs(arr,low,high,target));
    }

}
