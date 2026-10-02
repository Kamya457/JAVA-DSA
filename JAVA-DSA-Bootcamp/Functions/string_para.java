package Functions;

public class string_para {
    public static void main(String[] args) {
        String msg=greet("Kamya");
        System.out.println(msg);
    }
    static String greet(String name){
        return "Hello "+name+"!";
    }
}
