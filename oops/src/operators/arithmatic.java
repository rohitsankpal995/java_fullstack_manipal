package operators;

public class arithmatic {
    public void arithmatic() {
        System.out.println("🔥 Arithmatic Operators 🔥");

        int a = 10;
        int b = 88;

        System.out.println("Addition " + (a + b));
        System.out.println("Sutraction " + (a - b));
        System.out.println("Multiplication " + (a * b));
        System.out.println("Division " + (a / b));
        System.out.println("Modulo " + (a % b));
    }

    public void assignment() {
        System.out.println("🔥 Assignment Operators 🔥");
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println("✅ Addition Assignment");
        c += a;
        c = c + a;
        c += 100;
        System.out.println("👉 a " + a);
        System.out.println("👉 b " + b);
        System.out.println("👉 c " + c);

        System.out.println("✅ Subtraction Assignment");
        b -= a;
        b = b - a;
        b -= 10;
        System.out.println("👉 a " + a);
        System.out.println("👉 b " + b);
        System.out.println("👉 c " + c);

        System.out.println("✅ Multiplication Assignment");
        c *= a;
        c = c * a;
        c *= 10;
        System.out.println("👉 a " + a);
        System.out.println("👉 b " + b);
        System.out.println("👉 c " + c);

        System.out.println("✅ Division Assignment");
        b /= a;
        b = b / a;
        b /= 2;
        System.out.println("👉 a " + a);
        System.out.println("👉 b " + b);
        System.out.println("👉 c " + c);

        System.out.println("✅ Modulo Assignment");
        c %= a;
        c = c % a;
        c %= 7;
        System.out.println("👉 a " + a);
        System.out.println("👉 b " + b);
        System.out.println("👉 c " + c);
    }

    public void comparision() {
        System.out.println("🔥 Comparision Operators 🔥");
        int a = 10;
        int b = 20;
        boolean c = true;
        boolean res = false;

        System.out.println("✅ Equality");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 (a == b) != c");
        res = (a == b) != c;
        System.out.println("👉 res = " + res);

        System.out.println("✅ InEquality");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 (a != (b+=10)) == c");
        res = (a != (b+=10)) == c;
        System.out.println("👉 res = " + res);

        System.out.println("✅ Less than and Greater Than");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 ((a > 67) == (b <= 45)) == !c");
        res = ((a > 67) == (b <= 45)) == !c;
        System.out.println("👉 res = " + res);
    }

    public void logical() {
        System.out.println("🔥 Logical Operators 🔥");
        int a = 10;
        int b = 20;
        boolean c = true;
        boolean res = false;

        System.out.println("✅ AND && ");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 ((a > 89) && (b < 90)) && c");
        res = ((a > 89) && (b < 90)) && c;
        System.out.println("👉 res = " + res);

        System.out.println("✅ OR || ");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 ((a > 89) || (b < 90))");
        res = ((a > 89) || (b < 90));
        System.out.println("👉 res = " + res);

        System.out.println("✅ NOT ! ");
        System.out.println("👉 a = " + a);
        System.out.println("👉 b = " + b);
        System.out.println("👉 c = " + c);
        System.out.println("📌 !(a == b)");
        res = !(a == b);
        System.out.println("👉 res = " + res);
    }

    public void bitwise(){
        System.out.println("....Bitwise operators....");
        int a = 10;
        int b= 20;
        //and
        System.out.println(a&b);
        //or
        System.out.println(a|b);
        //XOR
        System.out.println(a^b);
    }
    public void ternary(){
        System.out.println("....Ternary Operators.....");
        int a =10;
        String num= a ==10 ? "Ten": "Something Else";
        System.out.println(num);
    }
    public void unary() {
        System.out.println("🔥 Unary Operators 🔥");
        int a = 10;

        System.out.println("✅ Pre Increment ++ ");
        System.out.println("👉 a = " + a);
        System.out.println("📌 ++a");
        System.out.println("👉 res = " + (++a));
        System.out.println("👉 a = " + a);

        System.out.println("✅ Post Increment -- ");
        System.out.println("👉 a = " + a);
        System.out.println("📌 a++");
        System.out.println("👉 res = " + (a++));
        System.out.println("👉 a = " + a);

        System.out.println("✅ Pre Decrement -- ");
        System.out.println("👉 a = " + a);
        System.out.println("📌 --a");
        System.out.println("👉 res = " + (--a));
        System.out.println("👉 a = " + a);

        System.out.println("✅ Post Decrement ++ ");
        System.out.println("👉 a = " + a);
        System.out.println("📌 a--");
        System.out.println("👉 res = " + (a--));
        System.out.println("👉 a = " + a);
    }
}


