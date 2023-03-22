package tool;

public class CopyMain {
    public static void main(String[] args) {
        CopyTool ct= new CopyTool();
        ct.copyCat1();
        ct.copyIt();
        ct.copyCat2();
        System.out.println(ct.count);//protected
        System.out.println(ct.istrue);//default
        System.out.println(ct.name);// public

    }
}
