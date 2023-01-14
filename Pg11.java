import java.io.*;

public class IPL
{

    static final int N = 20;


    static int countPair(char str[][], int n) 

    {

        int[] cnt = new int[1 << 10];
 

        // making the mask for each of the number.

        for (int i = 0; i < n; i++)

        {

            int mask = 0;

            for (int j = 0; j < str[i].length; ++j)

                mask |= (1 << (str[i][j] - '0'));

            cnt[mask]++;

        }
 

        // for each of the possible pair which can

        // make OR value equal to 1023

        int ans = 0;

        for (int m1 = 0; m1 <= 1023; m1++)

            for (int m2 = 0; m2 <= 1023; m2++)

                if ((m1 | m2) == 1023)

                {
 

               

                    ans += ((m1 == m2) ? (cnt[m1] * (cnt[m1] - 1)) :

                                          (cnt[m1] * cnt[m2]));

                }

        return ans / 2;

    }
 

    // Driver Code

    public static void main(String[] args) 

    {

        int n = 5;

        char str[][] = { "129300455".toCharArray(), 

                         "5559948277".toCharArray(),

                         "012334556".toCharArray(), 

                         "56789".toCharArray(), 

                         "123456879".toCharArray() };

        System.out.print(countPair(str, n) + "\n");

    }
}


