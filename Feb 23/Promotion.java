class Promotion{
    public static void main(String arg[]){
        System.out.println("Yes...");

     System.out.println( true ? Double.valueOf(3.1) : Integer.valueOf(3)) ;
   
     short s=10;
     byte  b =127;
     final int i =20;


     System.out.println(true ? s:3 );
     System.out.println(  true ? s : b);
     System.out.println( true ? b : i);

    // String st="";
     StringBuilder sb;

     //System.out.println( true ? st : sb);


        int in;
        Object  ob;


        System.out.println("here ..."+true ?  in : ob);




    }
}