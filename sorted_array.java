public class BinarySearchExample {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50, 60, 70};

        int search = 50;

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = (low + high) / 2;

            if(arr[mid] == search) {
                System.out.println("Element Found at Index: " + mid);
                return;
            }
            else if(arr[mid] < search) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        System.out.println("Element Not Found");
    }
}
