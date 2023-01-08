package homeWork;


import java.util.Scanner;

public class ToeCrossNull{

    private Field field = new Field();
    private Token tO = new Token("O");
    private Token tX = new Token("X");
    private Token currentToken =  tX;

    public void start() {
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Xod " + currentToken);
            System.out.println("Введите номер клетки:");
            int number = sc.nextInt();
            boolean isSucces = field.putToken(currentToken, number);
            field.print();
            boolean isWonCombination = field.checkWinner();
            boolean isCrossNullDraw = field.isFull();
            if (isWonCombination) {
                System.out.println("Победил игрок " + " " + currentToken);
                break;
            } if (isCrossNullDraw){
                System.out.println("Ничья");
                break;
            }
            if (isSucces) {
                switchToken();
                //updateWinCombination(number);
            }
        }
    }

    private void updateWinCombination(int number) {

    }

    private void switchToken() {
        if (currentToken == tX){
            currentToken = tO;
        } else {
            currentToken = tX;
        }
    }



}


