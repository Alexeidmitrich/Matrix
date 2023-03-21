package datastructure.stack;

public class Brackets<T> {


    public boolean task(String s) {
        Stack <Character> st = new ListStack <Character>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            System.out.print(ch);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == '[') {
                st.push(ch);
            } else if (ch == '{') {
                st.push(ch);
            }
            if (ch == ')' && st.peek().equals('(')) {
                st.pop();
            } else if (ch == ']' && st.peek().equals('[')) {
                st.pop();
            } else if (ch == '}' && st.peek().equals('{')) {
                st.pop();
            }
        }
        return st.isEmpty();
    }


    public static void main(String[] args) {
        Brackets<Character> br = new Brackets<>();
        br.task("{Kolobok rolled} [away from] (his grandmother)");

    }

}
