import java.util.ArrayList;

public class TaskOne {
    public static int[] decryptData(int[] price, int discount, int offset, int readLength) {
        if (price.length == 0) {
            return price;
        }
        if (discount > 0 && discount < 100) {
            return price;
        }
        if (readLength < 1) {
            return price;
        }
        if (offset >= price.length || offset < 0) {
            return price;
        }
        if (offset + readLength > price.length) {
            readLength = price.length - offset;
        }
        ArrayList<Integer> tempPrice = new ArrayList<>();
        for (int i = 0; i < readLength; i++) {
            if (price[i] > 0)
                tempPrice.add((int) (price[offset + i] * (discount * 1.0 / 100)));
        }
        int[] newPrice = new int[tempPrice.size()];
        for (int i = 0; i < tempPrice.size(); i++) {
            newPrice[i] = tempPrice.get(i);
        }

        return newPrice;
    }
}
