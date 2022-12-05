import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] Arr = {53, 78, 13, 9, 5, 17, 28, 719, 214};
        for (int i = 0; i < Arr.length; i++) {
            int count = 0;
            if (Arr[i] % 2 == 0) {
                count++;}
            int[] new_Arr = new int[count];
            for (int j = 0; j < new_Arr.length; j++) {
                int count2 = 0;
                if (Arr[i] % 2 == 0) {
                    j ++;
                    new_Arr[count2] = Arr[i];
                    System.out.println(new_Arr[count2]);
                }
            }
        }
    }
}