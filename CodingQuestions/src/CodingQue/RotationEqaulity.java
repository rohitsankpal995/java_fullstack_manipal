package CodingQue;

public class RotationEqaulity {

    public boolean isRotationEqual(String one, String two) {
        if (one.length() != two.length()) {
            return  false;
        }
        else {
            String str = one + one;
            int j=0;
            for(int i=two.length()-1;i>=0;i--){
                if(one.charAt(j)==two.charAt(i)){
                    j++;
                    return true;

                }
            }
            if (str.contains(two)) {
                return true;
            }
            else {
                return false;
            }
        }

    }
}
