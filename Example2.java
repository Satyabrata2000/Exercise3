package Exercise3;

//Find the third largest number in an array
public class Example2 {

    public static int getThirdLargest(int[] a, int total){
        int temp;
        for(int i=0; i<total; i++){
            for(int j = i+1; j<total; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[total-3];
    }

    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {11, 22, 33, 44, 55, 66};
        System.out.println("Third largest is " + getThirdLargest(a, 6));
        System.out.println("Third largest is " + getThirdLargest(b, 6));
    }
}
