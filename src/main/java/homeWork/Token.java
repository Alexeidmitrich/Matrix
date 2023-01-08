package homeWork;

public class Token {

    public final static int MAX_NUMBER_MOVE = 8;
    private String sign;
    private int numberWinCombination;


    public Token(String sign) {
        this.sign = sign;
        this.numberWinCombination = MAX_NUMBER_MOVE;
    }
    public void decrementWinCombination(int step) {
        this.numberWinCombination -= step; // this.numberMove =   this.numberMove -step;
    }
    public boolean hasWinCombination(){
        return this.numberWinCombination > 0;
    }

    public String getSign() {
        return sign;
    }


    @Override
    public String toString() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
