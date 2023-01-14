public class Solution {
    public boolean isValid(String s) {

        // Start typing your Java solution below
        // DO NOT write main() function

        if(s==null||s.length()==0) return true;
        Stack stack=new Stack();
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[') stack.push(s.charAt(i));
            else if((s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')&&!stack.empty()){
               char cur=stack.peek().toString().charAt(0);
               if((cur=='('&&s.charAt(i)==')')||(cur=='{'&&s.charAt(i)=='}')||(cur=='['&&s.charAt(i)==']')) stack.pop();
               else return false;            
            }else return false;
        }
        return stack.empty();
    }
}

