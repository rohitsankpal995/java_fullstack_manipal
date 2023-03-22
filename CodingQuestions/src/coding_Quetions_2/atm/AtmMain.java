package coding_Quetions_2.atm;
interface  CardSwipable {
    double balance ();
    int withdraw ();
    int depositee();
    int transfer();


}
class AbcCard implements CardSwipable{
    @Override
    public double balance(){
        return 0;
    }
    @Override
    public int withdraw (){
        return 0;
    }
    @Override
    public int depositee (){
        return 0;
    }
    @Override
    public int transfer (){
        return 0;
    }


}
class XyzCard implements CardSwipable{
    @Override
    public double balance(){
        return 0;
    }
    @Override
    public int withdraw (){
        return 0;
    }
    @Override
    public int depositee (){
        return 0;
    }
    @Override
    public int transfer (){
        return 0;
    }



}
class PqrCard implements CardSwipable{
    @Override
    public double balance(){
        return 0;
    }
    @Override
    public int withdraw (){
        return 0;
    }
    @Override
    public int depositee (){
        return 0;
    }
    @Override
    public int transfer (){
        return 0;
    }



}
class Atm {
    public  void swipe(CardSwipable card){
        card.balance();
        card.withdraw();
        card.depositee();
        card.transfer();
    }
}
public class AtmMain {
    public static void main(String[] args) {
        AbcCard card1 =new  AbcCard();
        XyzCard card2 =new  XyzCard();
        PqrCard card3 =new PqrCard();

        Atm atm =new  Atm();
         atm.swipe(card1);
        atm.swipe(card2);
        atm.swipe(card3);


    }
}
