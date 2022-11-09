import java.util.Stack;

public class project5 {

    static void bubbleSortStack(int a[], int n) {
        Stack<Integer> s1 = new Stack<>();

        for (int num : a) {
            s1.push(num);
        }

        Stack<Integer> s2 = new Stack<>();

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {
                while (!s1.isEmpty()) {
                    int t = s1.pop();

                    if (s2.isEmpty()) {
                        s2.push(t);
                    } else {

                        if (s2.peek() > t) {
                            int temp = s2.pop();
                            s2.push(t);
                            s2.push(temp);
                        } else {
                            s2.push(t);
                        }
                    }
                }
                a[n - 1 - i] = s2.pop();
            } else {

                while (!s2.isEmpty()) {
                    int t = s2.pop();

                    if (s1.isEmpty()) {
                        s1.push(t);
                    } else {

                        if (s1.peek() > t) {
                            int temp = s1.pop();

                            s1.push(t);
                            s1.push(temp);
                        } else {
                            s1.push(t);
                        }
                    }
                }

                a[n - 1 - i] = s1.pop();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] number={3,6,7,11,23,18,32,88};
        bubbleSortStack(number, number.length);
    }
}
