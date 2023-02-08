public  class FindMaxNumber{

    // three comparsion
    public static  int method1(int a,int b,int c){
        if(a>b & a>c)
        return a;
        
        if(b>a & b>c)
        return b;

        if(c>a & c>b)
        return c;

        return 0;
    }
    //two comparsion 
    public static int method2(int a,int b,int c){
        if(a>b & b>c)
        return a;

        if(b>c){
            return b;
        }
        return c;

    }

    // one comparsion

        public static int method3(int a,int b,int c){
            int max=a;
            if(b>max){
                max = b;
            }
            if(c>max){
                max=c;
            }
            return max;
        }

        public static void main(String arg[]){
            System.out.println(method3(2,5,001));
            System.out.println(method3(200,5,100));
            System.out.println(method3(12,5,1));
           
            System.out.println(method3(002,5,100));
            System.out.println(method3(2,005,1));
            System.out.println(method3(200,5,001));
        }

}