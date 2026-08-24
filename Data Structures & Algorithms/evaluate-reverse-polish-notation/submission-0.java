
class Solution {
    public int evalRPN(String[] tokens) {

        
        

        Stack<Integer> stack = new Stack<>();

        HashSet<String> ops = new HashSet<>(Set.of("+", "-", "*", "/"));

        for (String token : tokens) {
            if (ops.contains(token)) {
                int b = stack.pop();
                int a = stack.pop();

                int result=0;
                switch (token) {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b;
                        break;

                    default:
                        break;
                }

                stack.push(result);

            }

            else {
                int val = Integer.parseInt(token);
                stack.push(val);
            }

        }

        // ["1","2","+","3","*","4","-"]

        return stack.peek();

    }
}
