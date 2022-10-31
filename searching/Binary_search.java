package searching;

class Binary_search {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 8, 9, 11, 13 };
        int n = arr.length - 1;
        int l = 0, h = n, key = 2;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == key) {
                System.out.print(mid);
                break;
            }
            if (arr[mid] > key) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }

    }
}
