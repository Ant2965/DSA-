class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> a =new Stack<>();

        for(String b : tokens){
            if(b.equals("/") || b.equals("*") || b.equals("-")||b.equals("+")){
                int op2=a.pop();
                int op1=a.pop();

                int ans=operation(op1,op2,b);

                a.push(ans);

            }

            else{
                a.push(Integer.parseInt(b));
            }
        }

        return a.peek();
    }

    public static int operation(int op1,int op2,String b){
        switch(b){

            case "+":
            return op1 + op2;

            case "-":
            return op1-op2;
            case"*":
            return op1*op2;
            case"/":
            return op1/op2;


            default:
            throw new IllegalArgumentException("Invalid operator");
        }


    }
}