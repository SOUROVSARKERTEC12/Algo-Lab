import java.util.Scanner;

public class Flipsort {


    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int count = sc.nextInt();
                int swapCount = 0;

                if (count > 0) {
                    long[] values = new long[count];
                    for (int i = 0; i < values.length; i++) {
                        values[i] = sc.nextInt();
                    }

                    for (int i = 0; i < values.length; i++) {
                        for (int i2 = 0; i2 < values.length - i - 1; i2++) {
                            if (values[i2] > values[i2 + 1]) {
                                long temp = values[i2];
                                values[i2] = values[i2 + 1];
                                values[i2 + 1] = temp;
                                swapCount++;
                            }
                        }
                    }
                }

                System.out.println("Minimum exchange operations : " + swapCount);
            }
        } catch (Exception e) {
            System.exit(0);
        }
    }
}

