class BinarySearch {
    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        int[] arr = { 1, 9, 15, 22, 55, 63, 70, 94 };
        int res = bs.search(arr, 70);
        if (res == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at location : " + res);
        }
    }

    int search(int[] arr, int x) {

        int res = -1;
        int l = 0;
        int r = arr.length - 1;
        int mid = -1;

        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                res = mid;
                break;
            } else if (x < arr[mid])
                r = mid - 1;
            else
                l = mid + 1;

        }
        return res;
    }
}