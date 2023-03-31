public class nQueue{
    public static void main(String[] args) {
      boolean[][] array2d={{false,false,false,false},{false,false,false,false},{false,false,false,false},{false,false,false,false}};
      queens(array2d, 4);   
    }
    static int queens(boolean[][] board,int row){
     if(row==board.length){
        display(board);
        return 1;
     }
     // check above the coloum
     for(int c=0;c<(board.length);c++){
        for(int r=row;r>=(0);r--){
            if(board[r][c]){
                return 0;
            }
        }
        for(int r=row;r>=0;r--,c--){
            if(c==-1){
                return 0;
            }
            if(board[r][c]){
                return 0;
            }

        }
        for(int r=row;r>=0;c++,r--){
            if(c==board.length){
                return 0;
            }
            if(board[r][c]){
                return 0;
            }
        }
        board[row][c]=true;
        queens(board, row++);
        board[row][c]=false;
     }

    }
    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
        }
    }

}