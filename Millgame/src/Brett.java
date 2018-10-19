public class Brett {


    public Feld[][] PositionOnBoard;
    private static final int TotalPositions = 24;



    public Brett() {
        PositionOnBoard = new Feld[];
        buildBoard();

    }

    private void buildBoard(){
        PositionOnBoard[0][0] = FieldPos[1];
        PositionOnBoard[0][3] = new Feld [];
        PositionOnBoard[0][6] = new Feld [];
        PositionOnBoard[1][1] = new Feld [];
        PositionOnBoard[1][3] = new Feld [];
        PositionOnBoard[1][5] = new Feld [];
        PositionOnBoard[2][2] = new Feld [];
        PositionOnBoard[2][3] = new Feld [];
        PositionOnBoard[2][4] = new Feld [];
        PositionOnBoard[3][0] = new Feld [];
        PositionOnBoard[3][1] = new Feld [];
        PositionOnBoard[3][2] = new Feld [];
        PositionOnBoard[3][4] = new Feld [];
        PositionOnBoard[3][5] = new Feld [];
        PositionOnBoard[3][6] = new Feld [];
        PositionOnBoard[4][2] = new Feld [];
        PositionOnBoard[4][3] = new Feld [];
        PositionOnBoard[4][4] = new Feld [];
        PositionOnBoard[5][1] = new Feld [];
        PositionOnBoard[5][3] = new Feld [];
        PositionOnBoard[5][5] = new Feld [];
        PositionOnBoard[6][0] = new Feld [];
        PositionOnBoard[6][3] = new Feld [];
        PositionOnBoard[6][6] = new Feld [];



    }


    public void getBrett(){
        System.out.println("0     1 2   3   4 5     6");
        System.out.println("|     | |   |   | |     |");
        System.out.println("V     V V   V   V V     V");
        System.out.println();
        System.out.println(FieldPos[0][0]+" - - - - - "+FieldPos[0][3]+" - - - - - "+FieldPos[0][6]+"   <-- 0");
        System.out.println("|           |           |");
        System.out.println("|     "+FieldPos[1][1]+" - - "+FieldPos[1][3]+" - - "+FieldPos[1][5]+"     |"+"   <-- 1");
        System.out.println("|     |     |     |     |       ");
        System.out.println("|     | "+FieldPos[2][2]+" - "+FieldPos[2][3]+" - "+FieldPos[2][4]+"   <-- 2");
        System.out.println("|     | |       | |     |"+"       |    | |       | |     |");
        System.out.println(FieldPos[3][0]+" - - "+FieldPos[3][1]+"-"+FieldPos[3][2]+"       "+FieldPos[3][4]+"-"+FieldPos[3][5]+" - - "+FieldPos[3][6]+"   <-- 3");
        System.out.println("|     | |       | |     |"+"       |    | |       | |     |");
        System.out.println("|     | "+FieldPos[4][2]+" - "+FieldPos[4][3]+" - "+FieldPos[4][4]+" |     |"+"   <-- 4");
        System.out.println("|     |     |     |     |");
        System.out.println("|     "+FieldPos[5][1]+" - - "+FieldPos[5][3]+" - - "+FieldPos[5][5]+"   <--5");
        System.out.println("|           |           |");
        System.out.println(FieldPos[6][0]+" - - - - - "+FieldPos[6][3]+" - - - - - "+FieldPos[6][6]+ "   <--6");
    }

    private String FieldPos[][]; {
        switch (PositionOnBoard[][].getPlayerDoing()) {
            case Enum.Spieler_1:
                return "x";
            case Enum.Spieler_2:
                return "y";
            case Enum.keinSpieler:
                return "o";
            default:
                return null;
        }
    }

}

