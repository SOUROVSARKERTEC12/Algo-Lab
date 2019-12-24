public class Commonpair {


    // Returns true if the pair
    // is valid, otherwise false
    static boolean checkValidPair(int num1,
                                  int num2)
    {
        // converting integers
        // to strings
        String s1 = Integer.toString(num1);
        String s2 = Integer.toString(num2);

        // Iterate over the strings
        // and check if a character
        // in first string is also
        // present in second string,
        // return true
        for (int i = 0; i < s1.length(); i++)
            for (int j = 0; j < s2.length(); j++)
                if (s1.charAt(i) == s2.charAt(j))
                    return true;

        // No common
        // digit found
        return false;
    }

    // Returns the number
    // of valid pairs
    static int countPairs(int []arr, int n)
    {
        int numberOfPairs = 0;

        // Iterate over all
        // possible pairs
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (checkValidPair(arr[i], arr[j]))
                    numberOfPairs++;

        return numberOfPairs;
    }

    // Driver Code
    public static void main(String args[])
    {
        int []arr = new int[]{ 10, 12, 24 };
        int n = arr.length;
        System.out.print(countPairs(arr, n));
    }
}
