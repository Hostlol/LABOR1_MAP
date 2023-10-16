import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] x = new int[]{35, 43, 99, 12, 34, 63};
        int[] q = Problem1.gerundeteNoten(x);
        for(int i:q){
            System.out.println(i);
        }
        int h = Problem1.maxGerundeteNote(x);
        System.out.println(h);

        int[] z = new int[]{4, 8, 3, 10, 17};
        int y;
        Problem2 problem2 = new Problem2();
        y = problem2.maximum(z);
        System.out.println(y);
        int y1 = problem2.minimum(z);
        System.out.println(y1);
        int y2 = problem2.max_sum(z);
        System.out.println(y2);
        int y3 = problem2.min_sum(z);
        System.out.println(y3);
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] num3 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};

        int[] sum = Problem3.add(num1, num2);
        System.out.println(Arrays.toString(sum));
        int[] diff = Problem3.subtract(num4, num3);
        System.out.println(Arrays.toString(diff));
        int[] product = Problem3.multiply(num5, 2);
        System.out.println(Arrays.toString(product));
        int[] division = Problem3.divide(num5, 2);
        System.out.println(Arrays.toString(division));
    }
}