package reccursion.basic;

public class ReverseArray {
    public static void reverse(int[] arr, int left, int right){
        if(left>= right) return ;
        int temp;
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        reverse(arr, left+1, right-1);

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int n = arr.length;
        int left = 0;
        int right = arr.length-1;
        reverse(arr,left, right);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
