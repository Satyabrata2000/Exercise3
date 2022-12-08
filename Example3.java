package Exercise3;

import java.util.Arrays;

//Sort an array
public class Example3 {

    public static void main(String[] args) {
        int[] array = new int[] {1, 4, 3, 6, 5, 9, 0};
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
