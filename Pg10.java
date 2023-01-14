import java.io.*;
 

class B_D {
 

    // Function to convert binary to decimal

    static int binaryToDecimal(String n)

    {

        String num = n;

        int dec_value = 0;
 

        int base = 1;
 

        int len = num.length();

        for (int i = len - 1; i >= 0; i--) {

            if (num.charAt(i) == '1')

                dec_value += base;

            base = base * 2;

        }
 

        return dec_value;

    }
 

    

    public static void main(String[] args)

    {

        String num = new String("10101001");

        System.out.println(binaryToDecimal(num));

    }
}

