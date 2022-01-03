package src.com.example.sortingSearching;

public class MoveZero_end {

    public static void main(String[] args) {
        // 1
        int[] nums = { 0, 3, 2, 0, 8, 5};

        //2. 3, 2, 8, 5, 0, 0
        // array + 0 index
//        int n = nums.length; // 6, index -1
//        int index = 0;

        // 3, 2, 8, 5
//        for(int i=1; i<n; i++){
//            if(nums[i]!=0){
//                nums[index] = nums[i]; //
//                index++;
//            }
//        }
        // 3, 2, 8, 5, 0, 0
//        while(index < n){
//            nums[index] = 0;
//            index++;
//        }


        // 0, 0, 3, 2, 8, 5
        int n = nums.length; // 6, index - 1
        int index = n - 1; // 5

        // 방번호 5, 4, 3, 2, 10
        for(int i=n-1; i>=0; i--){
            if(nums[i]!=0){
                nums[index] = nums[i];
                index--;
            }
        }

        while(index >= 0){
            nums[index] = 0;
            index--;
        }

        for(int i : nums){
            System.out.println(i);
        }


    }
}
