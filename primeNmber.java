public class primeNmber {

    static boolean prime(int num){

        if(num==1){
            return false;
        }
        boolean flag=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                flag=false;
            }
        }

        return flag;
    }
    public static void main(String[] args) {
        if(prime(11)){
            System.out.println("Prime Number");
        }else{
            System.out.println("not a Prime Number");
        }
    }
}
