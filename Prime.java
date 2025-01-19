import java.util.Scanner;;
class Prime{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Boolean prime = true;
        
        if(n==2){
            System.out.println("Number is Prime");
        }else{
            for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                prime=false;
            }
        }
        }
        if(prime){
            System.out.println("Number is Prime");
        }else{
            System.out.println("Number is not Prime");
        }
    }
}