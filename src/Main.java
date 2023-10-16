public class Main {
    public static void main(String[] args) {
        int[] x = new int[]{35, 43, 99, 12, 34, 63};
        int[] q = Problem1.gerundeteNoten(x);
        for(int i:q){
            System.out.println(i);
        }
        int h = Problem1.maxGerundeteNote(x);
        System.out.println(h);
    }
}