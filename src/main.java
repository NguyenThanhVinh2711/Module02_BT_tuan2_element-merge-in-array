import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        int length = arr1.length + arr2.length;
        int arr3[] = new int[length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[j + arr1.length]=arr2[j];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
