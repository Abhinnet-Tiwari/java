
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
}
class BasicJava{
    public static void main(String[] args) {
        Basic obj=new Basic();
        obj.Star1(5);
    }
}