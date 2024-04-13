public class UniqueNumberOfOccurrences{
  public static  boolean uniqueOccurrences(int[] arr) {

    Map<Integer, Integer> countMap = new HashMap<>();
    for (int num : arr) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    Set<Integer> uniqueCounts = new HashSet<>();
    for (int count : countMap.values()) {
        if (uniqueCounts.contains(count)) {
            return false;
        }
        uniqueCounts.add(count);
    }

    return true;
}
public static void main(String[] args) {
  int arr[]={1,2,1};
  System.out.println(uniqueOccurrences(arr));
}
}