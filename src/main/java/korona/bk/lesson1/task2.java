package korona.bk.lesson1;

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {


        char[][] artSkl = {
                {'A', 'r', 't'},
                {'S', 'k', 'l'}
        };


        char[] oneDimArtSkl = {
                artSkl[0][0], artSkl[0][1], artSkl[0][2],
                artSkl[1][0], artSkl[1][1], artSkl[1][2]
        };

        Arrays.sort(oneDimArtSkl);


            System.out.print(oneDimArtSkl);

    }
}