package tik_tac_toe;

public class Board {
    private int order;

    public int getOrder() {
        return order;
    }

    public int[][] getBoard() {
        return board;
    }

    private int[][] board;

    Board(int order){
        this.order = order;
        this.board = new int[order][order];
    }

    /**
     * Returns a winner based on current status of the game.
     * @return +1 if 1st player won , -1 if second Player won and -1 otherwise
     */
    int getWinner(){
        int[] row = new int[this.order];
        int[] col = new int[this.order];
        int diag = 0;
        int rev_diag = 0;
        for (int i=0;i<this.order;i++){
            for (int j=0;j<this.order;j++){
                int item = this.board[i][j];
                row[i]+=item;
                col[j]+=item;
                if (i == j){
                    diag++;
                }else if(i+j == this.order){
                    rev_diag++;
                }
            }
        }
        boolean player_1_diag_check = (diag ==this.order || rev_diag == this.order);
        if (player_1_diag_check)return 1;
        boolean player_2_diag_check = (diag == -this.order || rev_diag == -this.order);
        if (player_2_diag_check)return -1;
        // No winner yet
        return 0;

    }

    /**
     * This makes move for the passed player and a given row , col tuple
     * @param player Player parameter "1" for player 1 , "-1" for player 2
     * @param row the row in which the player needs to make a move
     * @param col
     * @return 0 if successfully made the move for a given player , for a specific location , 1 otherwise
     */
     int makeMove(int player , int row , int col){
        if (this.board[row][col] != 0)return 1;
        this.board[row][col] = player;
        return 0;
    }
}
