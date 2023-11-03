import java.util.*;
public class StringExercise{

    // counting lowercase vowels 
    public static int countingVowel(String str){
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)== 'a'){
                count++;

            } 
             if(str.charAt(i)== 'e'){
                count++;

            }  if(str.charAt(i)== 'i'){
                count++;

            }  if(str.charAt(i)== 'o'){
                count++;

            }  if(str.charAt(i)== 'u'){
                count++;

            } 
        }
            return count;
    }

    // function for anagram 
    public static boolean isAnagram(String str1, String str2){
        // convert both of them into lowercase so we dont have to check for different case 
        str1= str1.toLowerCase();
        str2= str2.toLowerCase();

        //  we will check whether their lengths are same or not 
        if(str1.length()== str2.length()){
            // converting them to char array
            char ch1[]= str1.toCharArray();
            char ch2[]= str2.toCharArray();

            // sort them seperately 
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            
            boolean result= Arrays.equals(ch1, ch2);
            if(result){
                return true;
            }
            else{
                return false;
            }

        }
        else{
            return false;
        }
    }
    

        
    
    public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         String str= sc.nextLine();
         System.out.println("The total number of vowels in entered string is "+ countingVowel(str));

        //   Generating the output 
        String st= "Kanchan Jyoti";
        String st1= "Hello World";
        String st2= "Kanchan Jyoti";
        System.out.println(st.equals(st1)+" "+ st.equals(st2));

         // replace keyword 
        String st3= "kenchan".replace("e","a");
        System.out.println(st3);

        // Checking whether two strings are anagram or not
        String s1= "race"; String s2= "care";
        System.out.println(isAnagram(s1,s2));
    }
}