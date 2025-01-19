
class Basic{
    Basic(){
        System.out.println(" Java Time Start Now");
    }
    public void Star1(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void reverseN(int n){
        int result;
        while(n>0){
            int last=n%10;
            int rev = n/10;
            result = result*10+last;
        }
        System.out.println(result);
    }
}
class BasicJava{
    public static void main(String[] args) {
        Basic obj=new Basic();
        obj.Star1(5);
        obj.reverseN(456);
    }
}