//package java;

//import java.util.Scanner;

public class multi {
  public static void main(String[] args) {
    /*
     * Scanner sc = new Scanner(System.in);
     * int x = sc.nextInt();
     * int[][] flats;
     * flats = new int[x][x];
     * for (int i = 0; i < flats.length; i++) {
     * for (int j = 0; j < flats.length; j++) {
     * flats[i][j] = sc.nextInt();
     * }
     * }
     * for (int i = 0; i < flats.length; i++) {
     * for (int j = 0; j < flats.length; j++) {
     * System.out.print(flats[i][j]);
     * System.out.print(" ");
     * }
     * System.out.print("\n");
     * }
     */
    boolean isSorted = true;
    int[] arr = { 1, 5, 6, 7, 8 };
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        isSorted = false;
        break;
      }
    }
    if (isSorted) {
      System.out.println("The Array is sorted");
    } else {
      System.out.println("The Array is not sorted");
    }

  }
}
