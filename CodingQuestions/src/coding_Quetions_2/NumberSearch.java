package coding_Quetions_2;

public class NumberSearch {
    private int[] array;

    public NumberSearch(int[] array) {
        this.array = array;
    }

    public int contains(int number) {
        for (int n : array) {
            if (n == number) {
                return n;
            }
        }
        return -1;
    }
}
