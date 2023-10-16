public class Problem2 {
    public int maximum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("AArray empty");
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    public int minimum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("AArray empty");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    int max_sum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Array empty");
        }
        int sum = 0;
        int min = this.minimum(array);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum - min;
    }

    int min_sum(int[] array) throws Exception {
        if (array.length == 0) {
            throw new Exception("Array empty");
        }
        int sum = 0;
        int max = this.maximum(array);

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return sum - max;
    }
}
