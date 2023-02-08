import java.util.Scanner;
class SquareRoot{
    public static void getNumber(int number){
        int num=0;
        for(int i=2 ; i<50 ; i++){
             num = number/i;
            
            if(num * num == number){
                System.out.println(num * num == number);
                System.out.println(num);
                break;
        }
        

        }
             if(num * num != number){
                System.out.println(" NO Square Root This Number "+ number);
            }

    }

    public static void main(String arg[]){
               Scanner input  = new Scanner(System.in);
        System.out.println("Enter Any Number to Check Square Root");
        int no = input.nextInt();
        getNumber(no);
    }
}