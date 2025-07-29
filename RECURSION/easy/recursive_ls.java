package RECURSION.easy;

public class recursive_ls {
    static int ls(int[] arr,int index,int target,int location)
    {
         //b.c
        if(index == arr.length)
        {
            return location;
        }
        else if(arr[index] == target) {
            location = index;
            return location;
        }
        else {
            return ls(arr,index+1,target,location);
        }

    }

    public static void main(String[] args) {
        int [] arr ={3,2,1,18,18,9};
        int target = 18;
        System.out.println(ls(arr,0,target,-1));
    }
}
