import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        System.out.println("TicTacToe");
        char[][] board = new char[3][3];
        for(int i = 0;i<board.length;i++){
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';

            }
            System.out.println();
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner sc = new Scanner(System.in);
        while (!gameOver){
            printboard(board);
            System.out.println("Player "+player+" Enter:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            if(board[row][col] == ' '){
                //place the element
                board[row][col] = player;
                gameOver = haveWon(board,player);
                if (!gameOver && isBoardFull(board)) {
                    System.out.println("It's a draw!");
                    break;
                }
                if(gameOver){
                    System.out.println("Player "+player +" has won");
                }else {
                    player = (player == 'X')?'O' :'X';
                }
            }
            else {

                System.out.println("Invalid move");
            }
        }
        printboard(board);
    }

    public static void printboard(char[][] board){

        for(int i = 0;i<board.length;i++){
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+" | ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(char[][] board,char player){

        //for rows

        for (int row = 0; row < board.length; row++) {
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
                return true;
            }
        }
        //for columns
        for (int col = 0; col < board.length; col++) {
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }
        //for diagonals
        //principal diag
       if(board[0][0] == player && board[1][1] == player && board[2][2] == player ){
           return true;
       }
       //second diag
        if(board[0][2] == player && board[1][1]==  player && board[2][0]== player){
            return true;
        }
        return false;
    }
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false; // If there's an empty cell, the board is not full
                }
            }
        }
        return true; // If no empty cells, the board is full
    }

}
