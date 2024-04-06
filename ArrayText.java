import java.util.Scanner;
public class ArrayText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 3;
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0) {
                System.out.println(arr[i]);
            }
        }
        int[] arr1 = new int[10];
        for(int b=0; b<arr1.length; b++){
            arr1[b] = b+1;
            if(arr1[b]%2==0) {
                System.out.println(arr1[b]);
            }
        }
    }
}