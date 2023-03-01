package eva1_10_return;
public class EVA1_10_RETURN {

    public static void main(String[] args) {
        int a = square(10);
        System.out.println(a);
        System.out.println(square(89));
    }
    public static int square(int num){
        return num*num; 
    }
}
