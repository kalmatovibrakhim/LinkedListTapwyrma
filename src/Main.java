import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        int[] x = {1,2,4,6,3,5,7};
//        ArrayList<Integer> y = new ArrayList<>();
//        LinkedList<Integer> z = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            y.add(random.nextInt(10));
//            z.add(random.nextInt(10));
//        }
        int[] nums = new int[50];
        ArrayList<Integer>nums1 = new ArrayList<>();
        LinkedList<Integer>nums2 = new LinkedList<>();

        for (int i = 0; i < 50; i++) {
            nums[i]=random.nextInt(2);
            nums1.add(random.nextInt(2));
            nums2.add(random.nextInt(2));
        }

        System.out.println("Before Sort");
        System.out.println(Arrays.toString(nums));
        System.out.println(nums1);
        System.out.println(nums2);
        System.out.println("After  Sort");
        System.out.println(Arrays.toString(mSort(nums)));
        System.out.println(mSort(nums1));
        System.out.println(mSort(nums2));


    }
    static int[] mSort(int[] nums){
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]> nums[j]){
                    x = nums[i];
                    nums[i] = nums[j];
                    nums[j] = x;
                }
            }
        }
        return nums;
    }
    static ArrayList<Integer> mSort(ArrayList<Integer> nums){
        int x = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)> nums.get(j)){
                    x = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, x);
                }
            }

        }
        return nums;
    }
    static LinkedList<Integer> mSort(LinkedList<Integer> nums){
        int x = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if (nums.get(i)> nums.get(j)){
                    x = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, x);
                }
            }

        }
        return nums;
    }
}
