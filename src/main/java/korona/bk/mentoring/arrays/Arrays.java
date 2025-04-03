package korona.bk.mentoring.arrays;

public class Arrays {

    public static void main(String[] args) {
        int[] intI = {1, 2, 3, 4, 5};
        int[] intJ = new int[5];
        intJ[0] = 3;
        System.out.println(java.util.Arrays.toString(intJ));

        if (8 < 7) {
            //if(){}
            System.out.println("5 < 7");
        } else if (6 == 7) {
            System.out.println("erorr");
        } else {
            System.out.println("erorr2");
        }

        int k = intI[0]; //intI[intI.length -1];
        for (int i = intI.length - 1; i >= 1; i--) { //цикл
            if (k < intI[i]) {
                k = intI[i];
            }
        }
        System.out.println("----   " + k + "   ----");

        int sum = 0;
        for (int i = 0; i < intI.length; i++) {
            sum += intI[i];
        }
        System.out.println(sum);


        for (int num : intI) {
            System.out.println(num);
        }

        int j = 0;
        while (j < 5) {
            System.out.println(intI[j]);
            j++;
        }

        int intM [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < intM.length; i++) {
            for (int l = 0; l < intM[i].length; l++) {
                System.out.println(intM[i][l]);
            }

        }
    }
}
