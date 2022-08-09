public class TaskOne {
    public static int[] decryptData(int[] price, int discount, int offset, int readLength) {
        if (price.length == 0) {
            return price;
        }
        if (discount > 0  && discount < 100) {
            return price;
        }
        if (readLength < 1) {
            return price;
        }
        if (offset >= price.length) {
            return price;
        }
        if (offset + readLength > price.length) {
            readLength = price.length - offset;
        }
        int[] newPrice = new int[readLength];

        for (int i = 0; i < readLength; i++) {
            newPrice[i] = (int) (price[offset + i] * (discount * 1.0 / 100));
        }

        return newPrice;
    }
}
