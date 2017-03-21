    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> tempSet = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int max = 0;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
                deque.add(num);
                tempSet.add(num);
                if(deque.size() == m) {
                    if(tempSet.size() > max) {
                        max = tempSet.size();
                    }
                    int first = deque.remove();
                    if(!deque.contains(first)) {
                        tempSet.remove(first);
                    }
                }
            }
            System.out.println(max);
        }
    }