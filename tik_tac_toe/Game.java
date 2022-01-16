package tik_tac_toe;

public class Game {
    public int getGame_no() {
        return game_no;
    }

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public Board getObj() {
        return obj;
    }

    int game_no;
    String player1;
    String player2;
    Board obj;

    public Game(String player1,String player2,int game_no,int order){
        this.player1 = player1;
        this.player2 = player2;
        this.game_no = game_no;
        this.obj = new Board(order);
    }
    int move(int player,int row,int col){
        return this.obj.makeMove(player,row,col);
    }

}
