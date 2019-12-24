package DP;

public class Dice_Throw {


    public static long findWays(int f, int d, int s) {

        long mem[][] = new long[d + 1][s + 1];

        mem[0][0] = 1;

        for(int i=1; i<=d; i++) {
            // Iterate over sum
            for(int j=i; j<=s; j++) {

                mem[i][j] = mem[i][j-1] + mem[i-1][j-1];
                if(j-f-1 >= 0)
                    mem[i][j] -= mem[i-1][j-f-1];
            }
        }
        return mem[d][s];
    }


    public static void main(String[] args) {
        System.out.println(findWays(4, 2, 1));
        System.out.println(findWays(2, 2, 3));
        System.out.println(findWays(6, 3, 8));
        System.out.println(findWays(4, 2, 5));
        System.out.println(findWays(4, 3, 5));
    }
}

