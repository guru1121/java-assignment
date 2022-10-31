
class sum {
    public static void main(String[] args) {
<<<<<<< HEAD
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
=======
        int[] arr = { 5, 8, 7, 9, 1, 3, 2 };
>>>>>>> b240761df9ddc6936abed3b147ac9d574d58ec90
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
