import java.util.Scanner;

public class PatternNo9 {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int n= sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++)
        {
                   
            for(int j=1;j<=n;j++)
            {    
                k=i*j;        
                System.out.print(" ");
           
                 System.out.print(k);


            }       
             System.out.println(" ");

            
        }       



        
    }
    
}
