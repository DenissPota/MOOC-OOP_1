
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        
        int[] original = {1, 2, 3, 4};
        int[] copied = copy(original);

        // change the copied
        copied[0] = 99;

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }
    
    
    public static int[] copy(int[] array){
        int[]newArr = new int[array.length];
        
        for (int i = 0; i < array.length;i++){
            newArr[i] = array[i];
        }
        return newArr;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] newArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            newArr[i] = array[(array.length-1)-i];
        }
        return newArr;
    
    }
    
}
