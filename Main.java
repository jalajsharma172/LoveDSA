package Leet2441;

import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        int arr[] = {-1,2,-3,3};
        int arr[] = {-1,10,6,-7,7,1};
        System.out.println(calli(arr));
    }

        public static int calli(int[] nums) {
            HashSet<Integer> elements = new HashSet<>();
            int max = -1;
            for (int a = 0; a < nums.length; a++) {
                if (elements.contains(-nums[a])) {
                    if (nums[a]>0 & nums[a]>max){
                        max=nums[a];
                    }
                    else if (nums[a]<0 & -nums[a]>max){
                        max=-nums[a];
                    }
                }
                elements.add(nums[a]);
            }
            return max;
        }
}
