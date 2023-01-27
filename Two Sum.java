import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        int[] ar=new int[2];
        for(int i=0;i<nums.length;i++)
        {  if(map.containsKey(target-nums[i])){
            ar[1]=i;
            ar[0]=map.get(target-nums[i]);
           }
            map.put(nums[i],i);
        }
        
        return ar;
    }
    // public static void main(String[] args)
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();

    // }
}
