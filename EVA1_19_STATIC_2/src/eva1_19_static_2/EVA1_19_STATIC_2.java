package eva1_19_static_2;
public class EVA1_19_STATIC_2 {
    int a = 100; 
    
    public static void main(String[] args) {
        EVA1_19_STATIC_2 obj = new EVA1_19_STATIC_2();
        obj.noStaticMessage();
        System.out.println(obj.a);
        staticMessage();
    }
    public void noStaticMessage(){
        System.out.println("Not Static ");
    }
    public static void staticMessage(){
        System.out.println("Static");
    }
}
