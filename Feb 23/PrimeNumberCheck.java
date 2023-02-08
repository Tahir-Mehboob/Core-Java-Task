class PrimeNumberCheck{

    public static boolean isPrime(int number){

        if(number== 0 || number==1){
            return false;
        }
        if(number == 2){
            return true;
        }

        for(int i=2 ; i<=(number/2) ; i++){
            if( (number%i) == 0){
                return false;
            }
            System.out.println("loop work..."+i);
        }        
        return true;

    }

        public static void  printPrimeNumbers(int start,int end){
            if( start==0 || end==0 || start==1 || end==1){
                return;
            }
            if(start ==2){
                System.out.println(start+" Prime Number ");
            } 

            for(int s = start ; s<=( end/2 ) ; s++){
                if(end%s == 1){
                    System.out.println(s+"  Prime");
                }
                  
              //System.out.println(s+" prime Number");  

            }
        }

    public static void main(String arg[]){
           System.out.println(isPrime(29));
    }
}