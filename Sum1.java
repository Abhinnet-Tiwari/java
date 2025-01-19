import java.util.Scanner;

class Sum{
    // 1. Sum of even number and oder number
    public void sumOfEO(){
        Scanner sc = new Scanner(System.in);
        int evenN=0;
        int oddN=0;
        int n=0;
        do{
            System.out.println("Enter the number");
            n = sc.nextInt();
            if(n%2==0){
            evenN += n;
            }else{
            oddN += n;
            }
            System.out.println("Sum of even number is " + evenN);
            System.out.println("Sum of odd number is " + oddN);
        }while(n >= 1);

    }
    // 2. factorial of n number method-1
    public void fac(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
    // 2. factorial of n number method-2
    public int rec(int j){
        if(j==1||j==0){
            return 1;
        }
        return j*rec(j-1);
        }

        // 3. Multiplaction table
        public void multi(int n){
            for(int i=1;i<=10;i++){
                System.out.println(n + " * " + i + " = " + n*i);
            }
        }
    }


class Sum1 {
    public static void main(String args[]) {
        Sum s = new Sum();
        // s.sumOfEO();
        // s.fac(5);
        // int result = s.rec(5);
        // System.out.println(result);
        s.multi(5);
    }
}