import java.util.HashMap;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr =  new int[2]; 
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int second = target - nums[i];
            if(hm.containsKey(second)){
                arr =  new int[] {hm.get(second), i};
            }
                hm.put(nums[i], i);
            
}
   return arr;
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = sol.twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}
