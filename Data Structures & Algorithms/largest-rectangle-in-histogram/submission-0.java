

class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack= new Stack<>();
        //[2, 1, 5, 6, 2, 3]
        // 0  1  2  3  4  5
        int res=0;

        for(int i=0;i<heights.length;i++){

            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int thisbar=stack.pop();
                int leftwall=stack.isEmpty()?-1:stack.peek();
                

                int width=i-leftwall-1;
                int area=width*heights[thisbar];
                res=Math.max(res,area);
            }


             

            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int thisbar = stack.pop();
            int leftwall = stack.isEmpty() ? -1 : stack.peek();
            int width = heights.length - leftwall - 1;
            int area = width * heights[thisbar];
            res = Math.max(res, area);
        }

        return res;



        
    }
}
