
class sum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int n = arr.length;
        int E_sum = 0, O_sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                E_sum += arr[i];
            } else {
                O_sum += arr[i];
            }
        }
        System.out.println(E_sum);
        System.out.println(O_sum);
    }

}
