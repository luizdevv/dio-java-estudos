public class MinhaClasse {
    // variavel constante (const nomeVariavel) = final tipoVariavel (final String nomeVariavel)


    public static void main(String[] args) {
        // Tipo nomeBemDefinido = Atribuição (opcional em alguns casos)

        String meuNome = "Luiz";
        int anoNascimento = 2005;
        int idade = 19;
        double altura = 1.80;
        boolean deMaior = true;

        String firstName = "Luiz";
        String segundoNome = "Gustavo";

        String nomeCompleto = nomeCompleto (firstName, segundoNome);

        System.out.println(nomeCompleto);
    }

    // Escrevendo métodos
    // TipoRetorno nomeObjetivoNoInfinitivo Parâmetro(s)
    public static String nomeCompleto (String firstName, String segundoNome) {

        return  "Resultado do método: " + firstName.concat(" ").concat(segundoNome);
    }

}
