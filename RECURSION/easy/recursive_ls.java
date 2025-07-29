package RECURSION.easy;

import java.util.ArrayList;

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
    //Method-1 : Declaring the list outside the function and not returning anything
   static ArrayList<Integer> lis = new ArrayList<>();
   static   void findAll(int []arr, int target, int index)
    {
        if(index == arr.length) return;
        else if(arr[index] == target)
        {
            lis.add(index);
        }

        findAll(arr,target,index+1);
    }
    //Method-2 : Returning the arraylist in every function call and return type would be ArrayList... Works by passing the arraylist in the parameter
    static   ArrayList<Integer> findAll(int []arr, int target, int index, ArrayList<Integer> list)
    {
        if(index == arr.length)  return list;
        else if(arr[index] == target)
        {
            list.add(index);
        }

      return   findAll(arr,target,index+1,list);
    }

    public static void main(String[] args) {
        int [] arr ={3,2,1,18,18,9,0};
        int target = 18;
        System.out.println(ls(arr,0,target,-1));
        findAll(arr,target,0);
        System.out.println(lis);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAll(arr,target,0,list));
    }
}
