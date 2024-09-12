import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double D,r1,r2;
        System.out.println("Enter variables of equation :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        D=Math.sqrt(b*b-(4*a*c));

        r1=(-b+D)/(2*a);
        r2=(-b-D)/(2*a);

        System.out.println("Roots of equation are :\n"+r1+"\n"+r2);
        sc.close();

    }
    
}
