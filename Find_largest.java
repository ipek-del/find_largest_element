public class FindLargest {
    public static int findLargest(int[] arr) {
        if (arr.length == 0) return Integer.MIN_VALUE; // Boş dizi kontrolü
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 25, 8};
        System.out.println("En büyük sayı: " + findLargest(numbers));
    }
}
