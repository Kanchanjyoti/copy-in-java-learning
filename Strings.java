public class Strings{
    public static boolean isPallendrome(String str){

     int n= str.length();
        for(int i=0; i<= str.length()/2; i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }

    //  For calculating shortest path 
    public static float getShortestPath(String str){
        int x=0;
        int y=0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i)=='N'){
                y++;
            }
            else if(str.charAt(i)=='S'){
                y--;
            }
            else if(str.charAt(i)=='E'){
                x++;
            }
            else {
                x--;
            }
        }
        int X2= x*x;
        int Y2= y*y;
        return (float)Math.sqrt(X2+Y2);
    }

    public static String largestString(String str[]){
        String largest= str[0];
        for(int i=0; i<str.length; i++){
            if(largest.compareTo(str[i])<0){
                largest= str[i];
            }
        }
        return largest;
    }
    //  Converting it to uppercase
    public static void convertToUpperCase(StringBuilder str){
        StringBuilder stm = new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));
        stm.append(ch);
          for(int i=1; i<str.length();i++){
            if(str.charAt(i)== ' ' && i <str.length() ){
                stm.append(" ");
                i++;
                 stm.append(Character.toUpperCase(str.charAt(i)));
                
            }
            else{
                stm.append(str.charAt(i));
            }
          }
          System.out.print(stm);
     }

     // Compressing the string 
     public static String compressTheString(String str){
        String sc = " ";
        for(int i=0;i<str.length(); i++){
        Integer count =1;
         while( i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
            count++;
            i++;
         }
        sc+= str.charAt(i);
        if(count>1){
         sc+= count.toString();
        }
     }
    return sc;
     }
    public static void main(String args[]){
        String str1= "kanchan jyoti";
        String str2= "kanchan";
        String str3= new String("kanchan");
        String str4= "";
       
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1);

    // To print a string 
     for(int i=0; i<str1.length(); i++){
        System.out.print(str1.charAt(i)+" ");
    }

    // Checking whether string is pallendrom or not 
    String str= "racecar";
    System.out.println(isPallendrome(str));

    // Finding the shortest path to reach the destination

    String dir= "WNEENESENNN";
    System.out.println("The shortest path will be "+ getShortestPath(dir));

    // Print the largest string 
    String strings[]= {"mango","apple", "banana","orange"};
    System.out.println("The largest string will be "+ largestString(strings));

    // Convert the given string to uppercase
    StringBuilder stm = new StringBuilder("hi, my name is princess");
    convertToUpperCase(stm);

   // To compress the given string 
   String words = "aabbbccddde";
   System.out.print(compressTheString(words));
    }
}