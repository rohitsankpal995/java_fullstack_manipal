package tool;

public class CopyTool {

    private int x =10;
    protected  int count= 20;
    public  String name="Rohit";
    boolean istrue =true;
    int n =30;
    public void copyIt() {
        System.out.println("Files Copied");
    }

    private void copyCat(){
        System.out.println("inside private method");
    }

    protected void copyCat1(){
        System.out.println("inside protected method");
    }
    void copyCat2(){
        System.out.println("inside default method");
    }
    public void copyCat3(){
        System.out.println("inside public method");
    }

}
