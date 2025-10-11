package BraceChecker;

public class BraceCheck {

    public static void main(String[] args) {

        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        bc1.check();

        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        bc2.check();

        BraceChecker bc3 = new BraceChecker("({[]})");
        bc3.check();

        BraceChecker bc4 = new BraceChecker("([)]");
        bc4.check();
    }
}

class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        SimpleStack stack = new SimpleStack();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            if (isOpen(c)) {
                stack.push(new OpenBrace(c, i));
            } else if (isClose(c)) {
                if (stack.isEmpty()) {
                    System.out.println("Error: closed " + c + " at " + i + " but not opened");
                    return;
                }
                OpenBrace top = stack.peek();
                if (matches(top.ch, c)) {
                    stack.pop();
                } else {
                    System.out.println("Error: opened " + top.ch + " but closed " + c + " at " + i);
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            OpenBrace remaining = stack.peek();
            System.out.println("Error: opened " + remaining.ch + " at " + remaining.pos + " but not closed");
        } else {
            System.out.println("No errors found");
        }
    }

    private boolean isOpen(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean isClose(char c) {
        return c == ')' || c == ']' || c == '}';
    }

    private boolean matches(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }

    private static class OpenBrace {
        char ch;
        int pos;

        OpenBrace(char ch, int pos) {
            this.ch = ch;
            this.pos = pos;
        }
    }

    private static class SimpleStack {
        private java.util.ArrayList<OpenBrace> list = new java.util.ArrayList<>();

        void push(OpenBrace b) {
            list.add(b);
        }

        OpenBrace pop() {
            return list.remove(list.size() - 1);
        }

        OpenBrace peek() {
            return list.get(list.size() - 1);
        }

        boolean isEmpty() {
            return list.isEmpty();
        }
    }
}


