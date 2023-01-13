import java.util.*;
public class matchingcolor {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total value of n");
        int n = sc.nextInt(); 
        int i=0;
        System.out.println("Enter the value");
        int ary[] = new int[n];
        for( i = 0;i<n-1;i++)
            ary[i] = sc.nextInt();
        Arrays.sort(ary);
        int count = 0;
        for( i = 0;i< n-1;i ++) {
            if(ary[i] != ary[i + 1])
            {   count++;
                
            }
            else
            {
                i++;
            }
        }
        if(i==n-1)
        count++;
        System.out.println(count);
    }
 
}
 
