package korona.bk.mentoring.arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int sumI = sum(2, 3);
        System.out.println(sumI);
        int arrNums[] = {1, 2, 3, 4, 5, 6, 7, 8};
        even(arrNums);
    }

    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void even(int[] nums) {
        int[] arrE = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arrE[i] = nums[i];
                //  System.out.println("Even" + nums[i]);
            } else {
                if (nums[i] % 2 == 1) {
                    System.out.println("Odds" + nums[i]);
                }
            }
        }
        System.out.println("Evens" + Arrays.toString(arrWithoutZero(arrE)));
    }

    public static int[] arrWithoutZero(int[] arrE) {
        int counter = 0;
        for (int i = 0; i < arrE.length; i++) {
            if (arrE[i] != 0) {
                counter++;
            }

        }
        int index = 0;
        int[] arrWithoutZero = new int[counter];
        for (int i = 0; i < arrE.length; i++) {
            if (arrE[i] != 0) {
                arrWithoutZero[index++] = arrE[i];

            }
        }
        return arrWithoutZero;
    }
}
