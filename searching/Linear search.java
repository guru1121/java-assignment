package searching;

class Linear_search {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int k = 5;
        for (int i = 0; i < n; i++) {
            if (arr[i] % k == 0) {
                System.out.print(i);
            }
        }
    }
}