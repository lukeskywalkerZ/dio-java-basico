import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Operadores {
    public static void main(String[] args) throws Exception {
       //Operadores
       
       //Atribuição =
       String nome = "JOSÉ";
       char sexo = 'M';
       //Date datanasc = new Date();

       //Aritméticos
       double soma = 10.5 + 15.7;
       int subtração = 112 - 20;
       int divisao = 15 / 3;
       int modulo = 18 % 3;

       // + texto = CONCATENA

       String nomeCompleto = "LINGUAGEM" + " JAVA";

       System.out.println(nomeCompleto);

       //Unários - Juntamente com operador aritmético
            // Incrementar, decrementar, inverter valores e booleanos
       // + - ! - Negação

       //x repetição

       int numero = 5;

       //numero = numero + 1;

       numero++;

       System.out.println(numero);

       //booleano

       boolean variavel = true;

       variavel = !variavel;

       //Operador Ternário - Forma resumida de definir condição
       //Escolher entre 2 valores - Como se fosse IF - Única

        int a, b;
        String resultado = "";

        a = 5;
        b = 6;

        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";

        resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        //Operadores RELACIONAIS

        // == Igual
        // != Diferente
        // > Maior
        // < Maior
        // >= Maior ou Igual
        // <= Maior ou Igual

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;

        if (num1<num2) {

}
            System.out.println(resultado);
        }

        //equals compara 2 objetos - Compara o conteúdo dos objetos
}
