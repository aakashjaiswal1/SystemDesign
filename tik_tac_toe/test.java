package tik_tac_toe;

public class test {
    public static void main(String[] args) {
        Game obj = new Game("Aakash","Abhi",1,3);
        obj.move(1,0,0);
//        obj.move(1,1,1);
        obj.move(1,2,2);
//        obj.move(1,0,1);
//        obj.move(1,0,2);
        System.out.println(obj.obj.getWinner());
    }
}
