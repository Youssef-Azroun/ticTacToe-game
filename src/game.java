public class game {

    private final String[][] game;

    public game() {                      // the game bord.
        this.game = new String[][]{
                {"1", "2", "3" },
                {"4", "5", "6" },
                {"7", "8", "9" }
        };

    }

    public String[][] getGame() {
        return game;
    }

    public String WinLose() {       //This method contains every posible win in tic tac toe game.

        if (game[0][0].equals("X") && game[1][1].equals("X") && game[2][2].equals("X")) {
            return "X";
        } else if (game[0][0].equals("O") && game[1][1].equals("O") && game[2][2].equals("O")) {
            return "O";
        } else if (game[0][2].equals("X") && game[1][1].equals("X") && game[2][0].equals("X")) {
            return "X";
        } else if (game[0][2].equals("O") && game[1][1].equals("O") && game[2][0].equals("O")) {
            return "O";
        } else if (game[0][0].equals("O") && game[0][1].equals("O") && game[0][2].equals("O")) {
            return "O";
        } else if (game[0][0].equals("X") && game[0][1].equals("X") && game[0][2].equals("X")) {
            return "X";
        } else if (game[1][0].equals("O") && game[1][1].equals("O") && game[1][2].equals("O")) {
            return "O";
        } else if (game[1][0].equals("X") && game[1][1].equals("X") && game[1][2].equals("X")) {
            return "X";
        } else if (game[2][0].equals("O") && game[2][1].equals("O") && game[2][2].equals("O")) {
            return "O";
        } else if (game[2][0].equals("X") && game[2][1].equals("X") && game[2][2].equals("X")) {
            return "X";
        } else if (game[0][0].equals("O") && game[1][0].equals("O") && game[2][0].equals("O")) {
            return "O";
        } else if (game[0][0].equals("X") && game[1][0].equals("X") && game[2][0].equals("X")) {
            return "X";
        } else if (game[0][1].equals("O") && game[1][1].equals("O") && game[2][1].equals("O")) {
            return "O";
        } else if (game[0][1].equals("X") && game[1][1].equals("X") && game[2][1].equals("X")) {
            return "X";
        } else if (game[0][2].equals("O") && game[1][2].equals("O") && game[2][2].equals("O")) {
            return "O";
        } else if (game[0][2].equals("X") && game[1][2].equals("X") && game[2][2].equals("X")) {
            return "X";
        } else if (game[0][0] != "1" && game[0][1] != "2" && game[0][2] != "3" && game[1][0] != "4" && game[1][1] != "5" && game[1][2] != "6" && game[2][0] != "7" && game[2][1] != "8" && game[2][2] != "9") {
            return "Tie";

        }


        return null;
    }


    public int choice(String choise, String OX) {   //this method is for the player to chose which position they want to put the X or O.

        if (choise.equals("1") || choise.equals("2") || choise.equals("3") || choise.equals("4") || choise.equals("5") || choise.equals("6") || choise.equals("7") || choise.equals("8") || choise.equals("9")) {
            switch (choise) {
                case "1":
                    if (game[0][0].equals("1")) {
                        game[0][0] = OX;
                    } else {
                        return -1;
                    }
                    break;
                case "2":
                    if (game[0][1].equals("2")) {
                        game[0][1] = OX;
                    } else {
                        return -1;
                    }
                    break;
                case "3":
                    if (game[0][2].equals("3")) {
                        game[0][2] = OX;
                    } else {
                        return -1;
                    }
                    break;
                case "4":
                    if (game[1][0].equals("4")) {
                        game[1][0] = OX;
                    } else {
                        return -1;
                    }
                    break;
                case "5":
                    if (game[1][1].equals("5")) {
                        game[1][1] = OX;
                    } else {
                        return -1;
                    }

                    break;
                case "6":
                    if (game[1][2].equals("6")) {
                        game[1][2] = OX;
                    } else {
                        return -1;
                    }
                    break;
                case "7":
                    if (game[2][0].equals("7")) {
                        game[2][0] = OX;

                    } else {
                        return -1;
                    }

                    break;
                case "8":
                    if (game[2][1].equals("8")) {
                        game[2][1] = OX;
                    } else {
                        return -1;
                    }
                    break;
                case "9":
                    if (game[2][2].equals("9")) {

                        game[2][2] = OX;
                    } else {
                        return -1;
                    }
                    break;

                default:
            }
            return 1;
        } else {
            return 0;
        }

    }

    public void print() {        //this method is to print the game bord.

        for (int i = 0; i < game.length; i++) {
            for (int j = 0; j < game[i].length; j++) {
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
    }

}