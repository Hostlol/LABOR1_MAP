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

    }
}