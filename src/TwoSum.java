import java.util.HashMap;
import java.util.Map;

// Given an array of integers, return indices of the two numbers such that they add up to a specific target

// input: [1, 2, 7, 11, 15] with a target of 9
// output: [1, 2]

public class TwoSum {

  public static void main(String[] args) {
    int[] arrA = { 1, 2, 3, 4, 5 };
    int[] arrB = { 1, 2, 3, 7, 11, 15 };

    int[] ansA = Answer(arrA, 5);
    int[] ansB = Answer(arrB, 9);

    System.out.println(ansA[0] + "," + ansA[1]);
    System.out.println(ansB[0] + "," + ansB[1]);
  }

  public static int[] Answer(int[] arr, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < arr.length; i++) {
      int remainer = target - arr[i];

      if (map.containsKey(remainer)) {
        return new int[] { map.get(remainer), i };
      }

      map.put(arr[i], i);
    }

    throw new IllegalArgumentException("No solutions avaible");
  }
}
