package collectionOue;

public class App {

    public static void countChars(){
        CharacterCount cc = new CharacterCount();
        String op1 = cc.countChars("aaatttaeee");
        String sts1 = op1.equals("a4,t3,e3") ? "✅ Correct " : "❌ Wrong";
        System.out.println(sts1);

        String op2 = cc.countChars("qwqwwwqw");
        String sts2 = op2.equals("q3,w5") ? "✅ Correct " : "❌ Wrong";
        System.out.println(sts2);
    }
    public static void uniqueCommon() {
        CommonUnique cu = new CommonUnique();

        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {4, 5, 6, 7, 8};

        ;
        System.out.println(cu.unique(arr1, arr2));
        System.out.println(cu.common(arr1, arr2));
    }
    public static void main(String[] args) {
        countChars();
        uniqueCommon();
    }
}
