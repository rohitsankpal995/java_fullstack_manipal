package coding_Quetions_2;

public class NumberSearchMain {
    public static void main(String[] args) {
        int[] myArray = {11,12,13,14,20};
        NumberSearch searcher = new NumberSearch(myArray);
        int position = searcher.contains(20);
        System.out.println(position);

    }
}
