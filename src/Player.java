public class Player {    //this class is the super class, where player1 and player2 extends from it.

   protected String name;
   protected String XO;

    public Player(String name, String XO){
        this.name= name;
        this.XO= XO;
    }

    public Player(String name){
        this.name= name;
    }
}
