public class StringContainsVowel{



    public static boolean stringContainsVowels(String input) {
        
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String arg[]){
        System.out.println(stringContainsVowels("TahirMehboob"));
        System.out.println(stringContainsVowels("bmw"));
        System.out.println(stringContainsVowels("AEIOU"));
    }


}