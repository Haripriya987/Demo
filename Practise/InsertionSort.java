public class InsertionSort {
  public static void main(String[] args) {
      int[] array = {5, 2, 4, 6, 1, 3};

      System.out.println("Original Array:");
      printArray(array);

      insertionSort(array);

      System.out.println("\nSorted Array:");
      printArray(array);
  }

  public static void insertionSort(int[] array) {
      int n = array.length;
      for (int i = 1; i < n; i++) {
          int value = array[i];
          int j = i - 1;

          while (j >= 0 && array[j] > value) {
              array[j + 1] = array[j];
              j = j - 1;
          }
          array[j + 1] = value;
      }
  }

  public static void printArray(int[] array) {
      for (int i = 0; i < array.length; i++) {
          System.out.print(array[i] + " ");
      }
      System.out.println();
  }
}
