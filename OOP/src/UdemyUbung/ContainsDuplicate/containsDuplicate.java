package UdemyUbung.ContainsDuplicate;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] nums = {1,2,2,5,4};

        boolean result = solution(nums);
        System.out.println(result);

    }

    public static boolean solution(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int num : nums) {
            if (hashSet.contains(num)) {
                return true;
            }
            hashSet.add(num);
        }

        return false;
    }


}
