public class Problem4 {
    public static int cheapestKeyboard(int[] keyboards) {
        int cheapest = Integer.MAX_VALUE;
        for (int price : keyboards) {
            if (price < cheapest) {
                cheapest = price;
            }
        }
        return cheapest;
    }

    public static int mostExpensiveItem(int[] keyboards, int[] usbDrives) {
        int maxPrice = Integer.MIN_VALUE;
        for (int price : keyboards) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        for (int price : usbDrives) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    public static int maxUSBDriveWithinBudget(int[] usbDrives, int budget) {
        int maxPrice = -1;
        for (int price : usbDrives) {
            if (price <= budget && price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    public static int markusSpending(int budget, int[] keyboards, int[] usbDrives) {
        int maxSpending = -1;

        for (int keyboardPrice : keyboards) {
            for (int usbPrice : usbDrives) {
                int totalCost = keyboardPrice + usbPrice;
                if (totalCost <= budget && totalCost > maxSpending) {
                    maxSpending = totalCost;
                }
            }
        }

        return maxSpending;
    }

}
