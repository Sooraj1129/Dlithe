import java.util.*;
public class distance
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int n,i,x=0,y=0;
        System.out.println("enter the input");
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            switch(i)
            {
                case 0:x=x+(i+1)*10;
                       
                       break;
                case 1:y=y+(i+1)*10;
                       break;
                case 2:x=x-(i+1)*10;
                        
                       break;
                case 3:y=y-(i+1)*10;
                        
                       break;
                case 4:x=x+(i+1)*10;
                     
                       break;  
              case 5:x=x+(i+1)*10;
                     break;     
                
                       
            }
 
        }
        System.out.println(x+","+y);
 
     }    
}
 

