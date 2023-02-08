class Operator1{

    private  static void checkStringCode(){
        String s1 = "Tahir";
        String s2 = new String("Tahir");

        System.out.println(s1 == s2);
    
    }

    private static void checkArrayCode(){
        int [] ia = {0,1,2,3};
        int idx = (int) (Math.random() * 101 ) - 50;

        System.out.println(ia[ idx % ia.length] );
    }

    private static void checkArrayCode2(){
        int [] ia1 = {0,1,2,3};
        int [] ia2 = {10,20,30,40};
        int [] ia = ia1;
        int x=0; 

        System.out.println( (ia=ia2) [x=3] );
    
    }

     public static void main(String arg[]){

        checkStringCode();
        // int i=99;
        // System.out.println("Result " + ++i ) ;

            // int i=1;
            // int z;

            // try{
            //     z = 100 / --i;
            // }catch(Exception e){
            //     System.out.println("Hi i'm Exception ....");
            // }
            // System.out.println(i);

    }

}