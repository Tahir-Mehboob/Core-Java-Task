class DuplicateString{
    
    public static void getCharacters(String line){
        
        // for(int firstLine=0 ; firstLine<=line.length()-1; firstLine++ ){
        //     for(int ch=65 ; ch<=122;ch++){
        //         char letter=(char)ch;
                
        //         if(letter == line.charAt(firstLine)){
        //             System.out.println(firstLine);
        //         }

        //     }
        // }
            //int count=0;
                char[] newChar = new char[line.length()];

                for(int i=0 ; i<line.length(); i++){
                  newChar[i] = line.charAt(i);  ;
                    //System.out.println(newChar[i]);
                }

        } 

    public static void main(String arg[]){
            getCharacters("hello");
    }
}