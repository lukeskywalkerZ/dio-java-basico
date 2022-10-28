public class Lógicos {
    public static void main(String[] args) throws Exception {
       // && E
       // || OU

       boolean condição1 = true;
       boolean condição2 = false;

       if (condição1 && (7 > 4)){
        System.out.println("Duas Condições Verdadeiras");
       }

       if (condição1 || condição2){
        System.out.println("Pelo menos uma Condição Verdadeira");
       }
    }
}
