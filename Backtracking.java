public class Backtracking{
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void filingArr(int arr[], int i){
        if(i== arr.length){
            printArr(arr);
            return ;
        }
        arr[i]= i;
        filingArr(arr, i+1);
        arr[i]= arr[i]-2;
    }
    public static void findSubset(String str,String ans, int i){
        if(i==str.length()){
            if(ans.length()== 0){
                System.out.print("null");

            }
            else{
                System.out.print(ans + ", ");
            }
            return ;
        }
        findSubset(str,ans+str.charAt(i), i+1 );
        findSubset(str, ans, i+1);

    }

    public static void findPermutation(String str, String ans){
        if(str.length()== 0){
            System.out.println(ans);
            return;
        }
         for(int i=0; i<str.length(); i++){
            char curr= str.charAt(i);
            String newStr= str.substring(0,i)+ str.substring(i+1);
            findPermutation(newStr, ans+curr);
         }
    }
    public static boolean isSafe(int chessBoard[][], int row, int col){
        for(int j=row-1; j>=0; j--){
            if(chessBoard[j][col]== 'Q'){
                return false;
            }
        }
        for(int i= row-1, j= col+1; i>=0 &&  j<chessBoard.length; i--,j++ ){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        for(int i= row-1, j= col-1; i>=0 &&  j>=0 ; i--,j-- ){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static void printBoard(int chessBoard[][]){
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard.length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*********CHESSBOARD**********");
    }
    public static void nQueens(int chessBoard[][], int row){
        if(row== chessBoard.length){
            printBoard(chessBoard);
            return;
        }
       for(int i=0; i<chessBoard.length; i++)
        if(isSafe(chessBoard, row, i)){
            chessBoard[row][i]= 'Q';
            nQueens(chessBoard,row+1);
            chessBoard[row][i]= 'X';
        }
    }
    public static void main(String args[]){
        int arr[]= new int[5];
        //  problem 1 : [0,1,2,3,4] ---> [-2,-1,0,1,2]
        // filingArr(arr, 0);
        // printArr(arr);

        // find the subset of a string and print them 
        String str= "abc";
        // findSubset(str,"" ,0);

        //  Problem 3. find the all permutation for string 
        // findPermutation(str, "");

        //  Problem 4. Place N Queens in N X N chessboard such that no two queens can attack each other 
        int chessBoard[][]= new int[3][3];
         nQueens(chessBoard, 0);
    }
}