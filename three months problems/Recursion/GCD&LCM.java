import java.util.Scanner;

 class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // Write your code here

        int gcd = calculateGCD(n1,n2);
        int lcm = calculateLCM(n1, n2,gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }
     public static int calculateGCD(int a, int b) {
         while (b != 0) {
             int temp = b;
             b = a % b;
             a = temp;
         }
         return a;
     }

     // Method to calculate LCM using the relationship: LCM * GCD = a * b
     public static int calculateLCM(int a, int b, int gcd) {
         return (a * b) / gcd;
     }
}