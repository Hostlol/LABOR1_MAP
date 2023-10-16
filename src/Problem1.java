import java.util.ArrayList;
public class Problem1 {
    public static int[] unreichendeNoten(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        for (int j : array) {
            if (j < 40)
            {
                result[i++] = j;
            }
        }

        int[] unreichendeNoten = new int[i];
        System.arraycopy(result, 0, unreichendeNoten, 0, i);

        return unreichendeNoten;
    }
    public static int durchschnittlicherWert(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        sum = sum / array.length;

        return sum;
    }
    public static int[] gerundeteNoten(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        for (int j : array) {
            if ((j % 5 > 2) && (j > 38))
            {
                result[i++] = j + 5 - (j%5);
            }
            else
            {
                result[i++] = j;
            }

        }

        int[] gerundeteNoten = new int[i];
        System.arraycopy(result, 0, gerundeteNoten, 0, i);

        return gerundeteNoten;
    }
    public static int maxGerundeteNote(int[] array) {
        int[] result = new int[array.length];
        int i = 0;
        for (int j : array) {
            if ((j % 5 > 2) && (j > 38))
            {
                result[i++] = j + 5 - (j%5);
            }
            else
            {
                result[i++] = j;
            }

        }

        int[] gerundeteNoten = new int[i];
        System.arraycopy(result, 0, gerundeteNoten, 0, i);
        int max = 0;
        for(int q : gerundeteNoten)
        {
            if (max < q)
            {
                max = q;
            }

        }

        return max;
    }
}



