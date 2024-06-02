public class leetcodeweek400 {
//    class Solution {
//        public String clearStars(String s) {
//            Stack<Character> stk = new Stack<>();
//            for(char c : s.toCharArray()){
//                if(c == '*'){
//                    char small = findSmallest(stk);
//                    removeLastOccurrence(stk,small);
//                }
//                else{
//                    stk.push(c);
//                }
//            }
//            StringBuilder answer = new StringBuilder();
//            for(char c :stk){
//                answer.append(c);
//            }
//            return answer.toString();
//        }
//        public char findSmallest(Stack<Character> stk) {
//            char smallest = Character.MAX_VALUE;
//            for (char c : stk) {
//                if (c != '*' && c < smallest) {
//                    smallest = c;
//                }
//            }
//            return smallest;
//        }
//        public  void removeLastOccurrence(Stack<Character> stack, char element) {
//            Stack<Character> tempStack = new Stack<>();
//            boolean foundLast = false;
//
//            while (!stack.isEmpty()) {
//                char item = stack.pop();
//                if (item == element && !foundLast) {
//                    foundLast = true;
//                } else {
//                    tempStack.push(item);
//                }
//            }
//
//            while (!tempStack.isEmpty()) {
//                stack.push(tempStack.pop());
//            }
//
//
//        }
//
//    }

    public int countAvailableDays(int days, int[][] meetings) {
        boolean[] availability = new boolean[days + 1];

        for (int i = 1; i <= days; i++) {
            availability[i] = true;
        }


        for (int[] meeting : meetings) {
            int start = meeting[0];
            int end = meeting[1];
            for (int i = start; i <= end; i++) {
                if (i <= days) {
                    availability[i] = false;
                }
            }
        }


        int count = 0;
        for (int i = 1; i <= days; i++) {
            if (availability[i]) {
                count++;
            }
        }

        return count;
    }
}
