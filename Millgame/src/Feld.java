public class Feld {

    private boolean isUsed;
    private int positionIndex;
    private Enum PlayerDo;


    public boolean isUsed() {
        return isUsed;
    }

    public void set(Enum Spieler) {
        isUsed = true;
        PlayerDo = Spieler;
    }

    public Enum getPlayerDoing() {
        return PlayerDo;
    }

    public Feld(int position) {
        isUsed = false;
        this.positionIndex = position;
        PlayerDo = Enum.keinSpieler;
    }
}
