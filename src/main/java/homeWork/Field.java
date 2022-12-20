package homeWork;

public class Field {



    public String[][] field =
            {{" ", " ", " "},
                    {" ", " ", " "},
                    {" ", " ", " "}};


    public boolean putToken(Token tX, int number) {
        int column = number / 3;
        if (number == 3 || number == 6 || number == 9) {
            column = column - 1;
        }
        int row = (number % 3) - 1;
        if (row < 0) {
            row = row + 3;
        }
        if (field[column][row] == " ") {
            field[column][row] = tX.getSign();
            return true;
        } else {
            System.out.println("Введите ещё раз");
            return false;
        }
    }


    public void print() {
        System.out.println(field[0][0] + "   |   " + field[0][1] + "   |   " + field[0][2]);
        System.out.println("--- |  ---  |  ---");
        System.out.println(field[1][0] + "   |   " + field[1][1] + "   |   " + field[1][2]);
        System.out.println("--- |  ---  |  ---");
        System.out.println(field[2][0] + "   |   " + field[2][1] + "   |   " + field[2][2]);
        System.out.println();
    }


    public boolean checkWinner() {
        return isVerticalWin() || isHorisontalWin() || isDiagonalWin();
    }


    public boolean isHorisontalWin() {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0].equals(field[i][1]) && field[i][0].equals(field[i][2]) && !field[i][0].isBlank())
                return true;
        }
        return false;
    }

    public boolean isVerticalWin() {
        for (int i = 0; i < field.length; i++) {
            if (field[0][i].equals(field[1][i]) && field[0][i].equals(field[2][i]) && !field[0][i].isBlank())
                return true;
        }
        return false;
    }

    public boolean isDiagonalWin() {
        if (field[0][0].equals(field[1][1]) && field[0][0].equals(field[2][2]) && !field[1][1].isBlank()
                || field[2][0].equals(field[1][1]) && field[2][0].equals(field[0][2]) && !field[1][1].isBlank()) {
            return true;
        }
        return false;
    }

    public boolean isDraw() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == " ")
                    return false;
            }
        }
        return true;
    }
}
