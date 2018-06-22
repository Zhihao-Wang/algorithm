package binarySearch;

public class BS {
    public static int getIndex(int[] arr, int value) {
        int l=0,h= arr.length - 1;
        while (l<=h) {
            int mid=l+(h-l)/2;
            if (value==arr[mid])  return mid;
            if (value<arr[mid]) h=mid-1;
            else l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55, 66, 77 };
        int index = getIndex(arr, 88);
        System.out.println("index:" + index);
    }
}
