public class Addone {

    static int addOne(int x)
    {
        int m = 2;

        // Flip all the set bits
        // until we find a 0
        while( (int)(x & m) >= 1)
        {
            x = x ^ m;
            m <<= 1;
        }

        // flip the rightmost 0 bit
        x = x ^ m;
        return x;
    }

    /* Driver program to test above functions*/
    public static void main(String[] args)
    {
        System.out.println(addOne(13));
    }
}
