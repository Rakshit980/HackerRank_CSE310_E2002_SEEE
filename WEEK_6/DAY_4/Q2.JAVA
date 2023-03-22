import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      arr1[i] = scanner.nextInt();
    }
    int n2 = scanner.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = scanner.nextInt();
    }
    int n3 = scanner.nextInt();
    int[] arr3 = new int[n3];
    for (int i = 0; i < n3; i++) {
      arr3[i] = scanner.nextInt();
    }
    Set<Integer> set1 = new HashSet<>();
    Set<Integer> set2 = new HashSet<>();
    Set<Integer> commonSet = new HashSet<>();
    for (int i = 0; i < n1; i++) {
      set1.add(arr1[i]);
    }
    for (int i = 0; i < n2; i++) {
      set2.add(arr2[i]);
    }
    for (int i = 0; i < n3; i++) {
      int num = arr3[i];
      if (set1.contains(num) && set2.contains(num)) {
        commonSet.add(num);
      }
    }
    int[] commonArr = new int[commonSet.size()];
    int index = 0;
    for (int num : commonSet) {
      commonArr[index] = num;
      index++;
    }
    Arrays.sort(commonArr);
    for (int num : commonArr) {
      System.out.print(num + " ");
    }
  }
}