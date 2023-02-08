public class LinearSearch{
        public static int methodLinearSearch(int arr[],int item) {
            for(int current : arr){
                if(current == item){
                    return current; 
            }
             return -1;
        }

    
    public static void main(String arg[]){
        int myArr[]  ={2,6,8,1,9,5,7,3};
        System.out.println(methodLinearSearch(myArr,8));
        System.out.println(methodLinearSearch(myArr,10));
        System.out.println(methodLinearSearch(myArr,1));
        System.out.println(methodLinearSearch(myArr,4));

    }
}