package StreamApi;

public class Main {
    public static void containsDuplicate() {
        ContainsDuplicate cd = new ContainsDuplicate();
        System.out.println( cd.containsDuplicates(new Integer[]{1 ,8, 9, 7}));;
        System.out.println( cd.containsDuplicates(new Integer[]{1 , 7 ,8, 9, 7}));;
    }


    public static void filterList(){
        ListFind ls =new ListFind();
        ls.giveFilteredList();
    }

    public static void getSum(){
        SumOfTwoDArray std = new SumOfTwoDArray();
        std.getSum();
    }


    public static void main(String[] args) {
      // filterList();
       // containsDuplicate();
        getSum();
    }
}
