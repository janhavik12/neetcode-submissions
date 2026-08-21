

class Solution {
    public boolean isValid(String s) {

        HashMap<Character,Character> pairs=new HashMap<>();
        Stack<Character> stack=new Stack<>();

        pairs.put(')', '(');
        pairs.put(']', '[');
        pairs.put('}', '{');


        for(int i=0;i<s.length();i++){

            char c=s.charAt(i);

            if(pairs.containsKey(c)){
                if(stack.isEmpty()){
                    return false;
                }

                char top=stack.pop();

                if(top!=pairs.get(c)){
                    return false;
             

                }

                
            }

            else {
                stack.push(c);
            }



        }



        return stack.isEmpty();


        
    }
}
