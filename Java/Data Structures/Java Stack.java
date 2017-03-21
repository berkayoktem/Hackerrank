import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
       Scanner scn = new Scanner(System.in);
      
       HashMap<Character, Character> hashMap = new HashMap<>();
       hashMap.put('(', ')');
       hashMap.put('[', ']');
       hashMap.put('{', '}');

       while (scn.hasNext()) {
           String input = scn.next();
           boolean result = balance(input, hashMap);
           if(result == true){
               System.out.println("true");
           }
           else {
               System.out.println("false");
           }
       }
   }
    
    public static boolean balance(String input, HashMap<Character, Character> hashMap) {
        if ((input.length() % 2) != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            Character tempChar = input.charAt(i);
            if (hashMap.containsKey(tempChar)) {
                stack.push(tempChar);
            } else if (stack.isEmpty() || tempChar != hashMap.get(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}