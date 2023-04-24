package C2;

public class ex2_2 {

    public Integer Eculid(int a, int b){
        if (b == 0) {
            return a;
        }
        int i = a % b;
        return Eculid(b, i);
    };




}
