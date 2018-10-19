import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BrettTest {
    public static void main(String  args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Brett brett = new Brett();
        int i = 0;

        brett.getBrett();

        while(j <10) {
            if(j%2==0) {
                System.out.print("Spieler 1 ist an der Reihe: ");
                String v = br.readLine();
                if (brett.PositionOnBoard[Integer.parseInt(s)].isUsed()) { //wenn besetzt
                    System.out.println("Feld bereits besetzt");

                } else {
                    brett.PositionOnBoard[Integer.parseInt(v)].set(Enum.Spieler_1);
                    j++;
                    brett.getBrett();
                }
            }
            else{
                System.out.print("Spieler 1 ist an der Reihe: ");
                String w = br.readLine();
                if (brett.PositionOnBoard[Integer.parseInt(w)].isUsed()) { //wenn besetzt
                    System.out.println("Feld bereits besetzt");

                } else {
                    brett.PositionOnBoard[Integer.parseInt(w)].set(Enum.Spieler_2);
                    j++;
                    brett.getBrett();
                }
            }
        }

    }
}
}

