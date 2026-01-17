//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      StackArray stack =new StackArray(4);
      stack.push(37);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      //stack.printStack();
      stack.pop();
      stack.printStack();
      stack.peek();



        }
    }
