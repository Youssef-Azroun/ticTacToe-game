import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        game ticTackToe = new game();

        System.out.println("Hello and welcome to Tic Tac Toe!");
        System.out.println("");
        System.out.println("How to play:");
        System.out.println("Tic-tac-toe, noughts and crosses, or Xs and Os is a paper-and-pencil game" );
        System.out.println("for two players who take turns marking the spaces in a three-by-three grid ");
        System.out.println("with X or O. The player who succeeds in placing three of their marks in a ");
        System.out.println("horizontal, vertical, or diagonal row is the winner.");
        System.out.println("");


        System.out.println("What is the first players name?");
        Player P1= new Player1(scan.next());
        System.out.println("What is the second players name?");
        Player P2= new Player2(scan.next());
        System.out.println("Hey " + P1.name + " and " + P2.name + "!");

        System.out.println(P1.name + " is X player. " + P2.name + " is O player.");
        ticTackToe.print();
        String n = null;
        int a1;
        int a2 ;
        do {
            do {
                a1 = ticTackToe.choice(scan.next(), P1.XO);
                if (a1 == 1) {
                    ticTackToe.print();
                    n = ticTackToe.WinLose();
                    if (n == null) {
                        do {
                            a2 = ticTackToe.choice(scan.next(), P2.XO);
                            if (a2 == 1) {
                                ticTackToe.print();
                                n = ticTackToe.WinLose();
                            } else if (a2 == 0) {
                                System.out.println("Please write a valid number between 1 and 9");
                            } else if (a2 == -1) {
                                System.out.println("Posistion alredy occupide, try again.");
                            }
                        } while (a2 != 1);
                    }

                } else if (a1 == 0) {
                    System.out.println("Please write a valid number between 1 and 9");
                } else if (a1 == -1) {
                    System.out.println("Posistion alredy occupide, try again.");
                }
            }while (a1!=1);
            


        }while (n== null);

        if (n.equals("X")){
            System.out.println(P1.name+ " Won!");
        }
        else if (n.equals("O")){
            System.out.println(P2.name + " Won!");
        }
        else{
            System.out.println(" Tie");
        }
    }
}