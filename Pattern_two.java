public class Pattern_two{
    public static void main(String args[]){

        // Print hollow rectangle 
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4;j++){
                if(i==1 || i ==4 || j==4 || j==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    

    // Problem 2. rotated pyramid

    for(int i=1;i<=4; i++){
        for(int j=1;j<=4;j++){
            if(i+j > 4){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }

    // Problem 3. inverted half pyramid

    for(int i=1; i<= 5; i++){
        for(int j=1; j<= 5-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }

    // floyd's triangle 

    int counter=1;

    for(int i=1; i<= 5; i++){
        for(int j=1; j<= i; j++){
            System.out.print(counter+ " ");
            counter++;

        }
        System.out.println();
    }

    // 0/1 triangle 
      
    for(int i=1; i<= 5; i++){
        for(int j=1; j<=i; j++){
            if((i+j)%2 == 0){
                 System.out.print("1 ");
            }
            else{
                 System.out.print("0 ");

            }
        }
        System.out.println();
    }
          // for first half      
   for(int i=1; i<=4; i++){
    for(int j=1; j<= 8; j++){
        if(j<= i || j >=(8-i+1)){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }

    }
    System.out.println();
   }

   // for second half 
   for(int i=1;i<=4; i++){
    for(int j=1;j<=8;j++){
        if(j<= 4-i+1 || j>=(4+i)){
            System.out.print("* ");
        }
        else{
            System.out.print("  ");
        }
    }
    System.out.println();
   }

   // print solid rhombus

   for(int i=1; i<=4;i++){
    for(int j=1; j<=7-i+1;j++){
        if( (i+j) >=5){
            System.out.print("* ");

        }
        else{
            System.out.print("  ");
        }
    }
    System.out.println();
   }

   // hollow rhombus 

   for(int i=1; i<= 4;i++){
    for(int j=4-i; j>=1;j--){
        System.out.print("  ");
    }
    for(int k=1; k<=4; k++){
        if(i==1||k==1||k==4||i==4){
            System.out.print(" *");
        }
        else{
            System.out.print("  ");
        }
    }
        System.out.println();


}

     // diamond pattern 
      
      for(int i=1; i<=4;i++){
        //for spaces 
        for(int j=4-i; j>0;j--){
            System.out.print("  ");
        }
        //  for stars 
        for(int k=1; k<= (2*i)-1; k++){
            System.out.print("* ");
        }

        System.out.println();
      }
       for(int i=4; i>=1;i--){
        //for spaces 
        for(int j=4-i; j>0;j--){
            System.out.print("  ");
        }
        //  for stars 
        for(int k=1; k<= (2*i)-1; k++){
            System.out.print("* ");
        }

        System.out.println();
      }
}
}