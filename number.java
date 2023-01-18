import java.util.Scanner;
class RightTriangle {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a, b;
        for(a = 1; a < n; a++) {
            for(b = 1; b <= a; b++) {
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
