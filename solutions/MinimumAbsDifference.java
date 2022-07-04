package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author rain
 */
public class MinimumAbsDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l = arr.length;
        int j = 1;
        int mark;
        int target = 100000;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < l - 1; i++) {
            mark = arr[j] - arr[i];
            if(mark < target) {
                target = mark;
                result.clear();
                List<Integer> num = new ArrayList<>();
                num.add(arr[i]);
                num.add(arr[j]);
                result.add(num);
            } else if (mark == target) {
                List<Integer> num = new ArrayList<>();
                num.add(arr[i]);
                num.add(arr[j]);
                result.add(num);
            }
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3};
        System.out.println(minimumAbsDifference(arr));
    }
}
