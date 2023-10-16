public class Problem3 {
    public static int[] add(int[] num1, int[] num2) {
        int carry = 0;
        int n = num1.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        }

        return result;
    }

    public static int[] subtract(int[] num1, int[] num2) {
        int borrow = 0;
        int n = num1.length;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }

    public static int[] multiply(int[] num, int digit) {
        int n = num.length;
        int carry = 0;
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int product = num[i] * digit + carry;
            result[i] = product % 10;
            carry = product / 10;
        }

        if (carry > 0) {
            int[] newResult = new int[n + 1];
            newResult[0] = carry;
            System.arraycopy(result, 0, newResult, 1, n);
            return newResult;
        }

        return result;
    }

    public static int[] divide(int[] num, int divisor) {
        int n = num.length;
        int[] result = new int[n];
        int carry = 0;

        for (int i = 0; i < n; i++) {
            int current = num[i] + carry * 10;
            result[i] = current / divisor;
            carry = current % divisor;
        }

        return result;
    }
}
