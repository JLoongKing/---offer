class DuplicateNumberInArray{
    public static void main(String[] args) {
        int[] a = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(a));
    }

    public static int findRepeatNumber(int[] nums) {
        int i = 0; 
        while (i < nums.length) {
            if(nums[nums[i]] == nums[i]&&nums[i] != i) 
                return nums[i];
            if(nums[i]!=i){
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
                continue;
            }
           
            i++;
          
          
        }
        return -1;   
        // int i = 0;
        // while(i < nums.length) {
        //     if(nums[i] == i) {
        //         i++;
        //         continue;
        //     }
        //     if(nums[nums[i]] == nums[i]) return nums[i];
        //     int tmp = nums[i];
        //     nums[i] = nums[tmp];
        //     nums[tmp] = tmp;
        // }
        // return -1;

    }
}
