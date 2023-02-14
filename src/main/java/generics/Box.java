package generics;

public class Box<E> {
    E x;
    E [] a = (E[])new Object[5];// 'то ну;но запомнить. тут у все[ учеников про,лемы
    public void setX(E x) {
        this.x = x;
    }

    public static void main(String[] args) {
        Box <String> box = new Box();
        box.setX("A1");
        Box<Integer> box1 = new Box<>();

        box1.setX(6);
        double d = 5;
        int x =(int) d;
    }
}
