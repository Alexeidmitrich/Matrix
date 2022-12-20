package homeWork;

public class Token {
    
    private String sign;

    public Token(String sign) {
        this.sign = sign;
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
