public class MinhaClasse {
    
    public static void main (String[] args){
        //System.out.print("Boa tarde! Td bem pessoal?");

        int ano = 2021;
        ano = 2022;
        double altura = 1.65;
        int anoFabricacao = 2022;

        final String BR = "Brasil";
        final double PI = 3.14;

        boolean verdadeira = false;

        anoFabricacao = 2023;

        String primeiroNome = "Luke";
        String segundoNome = "Skywalker";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    //Métodos TipoRetorno NomeObjetivoNoInfinitivo Parametro(s)

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
