


public class main {


    public static void main(String[] args) {
        System.out.println(degree(0,1));
        System.out.println(knapsack(values.length - 1, W));
    }
    public static int degree(int number, int deg){
        int value = number;
        if (deg==0){
            return 1;

        }
        else if (deg>1) {

            number = number*value;
            deg--;
            degree(number,deg);
        }
        else if (deg==1) {
            return number;
        }

        return number;

    }


    static int[] values = new int[] {894, 260, 392, 281, 27};
    static int[] weights = new int[] {8, 6, 4, 0, 21};
    static int W = 30;

    private static int knapsack(int i, int W) {
        if (i < 0) {
            return 0;
        }
        if (weights[i] > W) {
            return knapsack(i-1, W);
        } else {
            return Math.max(knapsack(i-1, W), knapsack(i-1, W - weights[i]) + values[i]);
        }
    }


}

