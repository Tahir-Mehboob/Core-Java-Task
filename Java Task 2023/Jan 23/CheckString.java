public class CheckString{
     //  i commit on git
    public  static boolean isUpperCase(String s){
        return s.chars().allMatch(Character::isUpperCase);
    } 

    public static boolean isLowerCase(String s){
       return s.chars().allMatch(Character::isLowerCase);
    }

    public static void main(String arg[]){
        System.out.println(isUpperCase("Tahir"));
        System.out.println(isUpperCase("TAHIR"));

        
        System.out.println(isLowerCase("MEHBOOB"));
        System.out.println(isLowerCase("ali"));
    }
}