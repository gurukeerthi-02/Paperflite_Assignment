//Example 1:
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//Input: nums = [1]
//Output: 1


import java.util.HashMap;

public class Problem1 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(findNonDuplicate(nums));
//        System.out.println(optimised(nums));
    }

    static int findNonDuplicate(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }

    static int optimised(int[] nums){
        int result = 0;
        for(int num:nums){
            result ^= num;
        }
        return result;
    }
}