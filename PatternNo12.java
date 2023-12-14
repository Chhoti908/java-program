import java.util.Scanner;
public class PatternNo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N=");
        int n = sc.nextInt();
       // System.out.println("Enter the number m=");

       // int m=sc.nextInt();
       int k ;
        for (int i = 1; i <= n; i++) {
                 k=i;
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");

                System.out.print(k);
                k=k+n;
                


            }
            System.out.println(" ");

        }

    }
    
}
