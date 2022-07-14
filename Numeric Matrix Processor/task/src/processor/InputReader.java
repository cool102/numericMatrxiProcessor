package processor;

import java.util.Scanner;

public class InputReader {
    static Scanner sc = new Scanner(System.in);
    static String[] split;

    public static int[][] readMatrix() {

        while (true) {
            split = sc.nextLine().split("\\s+");
            if (!sc.hasNextLine()) {
                break;
            }
        }

        int rows = Integer.parseInt(split[0]);
        int columns = Integer.parseInt(split[1]);
        int[][] twoDimArray = new int[rows][columns];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = Integer.parseInt(sc.next());
                if (!sc.hasNextLine()) {
                    break;
                }
            }
        }

        return twoDimArray;
    }

    public static void print2Darray(int[][] arr) {


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }


}
