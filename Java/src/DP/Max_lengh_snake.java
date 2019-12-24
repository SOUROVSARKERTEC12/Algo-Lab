package DP;

import java.util.LinkedList;
import java.util.List;

public class Max_lengh_snake {

    static int M = 4;
    static int N = 4;

    static class Point
    {
        int x, y;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    };

    // Function to find maximum length Snake sequence path
// (i, j) corresponds to tail of the snake
    static List<Point> findPath(int grid[][],
                                int mat[][],
                                int i, int j)
    {
        List<Point> path = new LinkedList<>();

        Point pt = new Point(i, j);
        path.add(0, pt);

        while (grid[i][j] != 0)
        {
            if (i > 0 &&
                    grid[i][j] - 1 == grid[i - 1][j])
            {
                pt = new Point(i - 1, j);
                path.add(0, pt);
                i--;
            }
            else if (j > 0 && grid[i][j] - 1 ==
                    grid[i][j - 1])
            {
                pt = new Point(i, j - 1);
                path.add(0, pt);
                j--;
            }
        }
        return path;
    }

    // Function to find maximum length Snake sequence
    static void findSnakeSequence(int mat[][])
    {
        // table to store results of subproblems
        int [][]lookup = new int[M][N];

        // initialize by 0

        // stores maximum length of Snake sequence
        int max_len = 0;

        // store cordinates to snake's tail
        int max_row = 0;
        int max_col = 0;

        // fill the table in bottom-up fashion
        for (int i = 0; i < M; i++)
        {
            for (int j = 0; j < N; j++)
            {
                // do except for (0, 0) cell
                if (i != 0 || j != 0)
                {
                    // look above
                    if (i > 0 &&
                            Math.abs(mat[i - 1][j] -
                                    mat[i][j]) == 1)
                    {
                        lookup[i][j] = Math.max(lookup[i][j],
                                lookup[i - 1][j] + 1);

                        if (max_len < lookup[i][j])
                        {
                            max_len = lookup[i][j];
                            max_row = i; max_col = j;
                        }
                    }

                    // look left
                    if (j > 0 &&
                            Math.abs(mat[i][j - 1] -
                                    mat[i][j]) == 1)
                    {
                        lookup[i][j] = Math.max(lookup[i][j],
                                lookup[i][j - 1] + 1);
                        if (max_len < lookup[i][j])
                        {
                            max_len = lookup[i][j];
                            max_row = i; max_col = j;
                        }
                    }
                }
            }
        }
        System.out.print("Maximum length of Snake " +
                "sequence is: " + max_len + "\n");

        // find maximum length Snake sequence path
        List<Point> path = findPath(lookup, mat, max_row,
                max_col);

        System.out.print("Snake sequence is:");
        for (Point it : path)
            System.out.print("\n" + mat[it.x][it.y] + " (" +
                    it.x + ", " + it.y + ")");
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = {{9, 6, 5, 2},
                {8, 7, 6, 5},
                {7, 3, 1, 6},
                {1, 1, 1, 7}};

        findSnakeSequence(mat);
    }
}
