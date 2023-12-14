import java.util.Scanner;
public class PatternNo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N=");
        int n = sc.nextInt();
        System.out.println("Enter the number m=");

        int m=sc.nextInt();
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= m; j++) {
                System.out.print(" ");

                System.out.print(j+" " +i+" ");

            }
            System.out.println(" ");

        }

    }

}
