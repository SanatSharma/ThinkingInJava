package StacksQueues;
import java.util.Stack;
/*Your job is to create a calculator which evaluates expressions in Reverse Polish notation.

For example expression 5 1 2 + 4 * + 3 - (which is equivalent to 
5 + ((1 + 2) * 4) - 3 in normal notation) should evaluate to 14.

Note that for simplicity you may assume that there are always spaces between 
numbers and operations, e.g. 1 3 + expression is valid, but 1 3+ isn't.

Empty expression should evaluate to 0.

Valid operations are +, -, *, /.

You may assume that there won't be exceptional situations (like stack underflow 
or division by zero).
*/
public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double evaluate(String expr) {
		String[] expression = expr.split(" ");
		if(expr.equals(""))
			return 0;
		else if(expression.length%2==0)
			throw new IllegalArgumentException("Incorrect expression");
		double result = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();
		for(String op : expression){
			if(operators.indexOf(op)==-1){
				stack.push(op);
			}
			else{
				double val1 = Double.parseDouble(stack.pop());
				double val2 = Double.parseDouble(stack.pop());
				switch(op){
				case "+" : stack.push(String.valueOf(val1+val2));
				break;
				case "-" : stack.push(String.valueOf(val2-val1));
				break;
				case "*" : stack.push(String.valueOf(val1*val2));
				break;
				case "/" : stack.push(String.valueOf(val2/val1 ));
				break;
				}
			}
		}
		
		result = Double.parseDouble(stack.pop());
		return result;
	  }
}
