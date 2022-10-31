class RevArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int n = arr.length - 1;

        for (int i = n; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
