package dio.variaveis;

public class Aulaum {
    public static void main(String[] args) {

        int i;
        //int 1; variavel já existe
        int I; // letras maisculas e minusculas diferentes tipos de variaveis
        //int 1a;
        int _1a; //Ferindo as boas práticas
        int $aq; //Ferindo as boas práticas

        //valor inicial para cada uma das váriaveis

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        final int j = 10; /*final = Constante*/
        //j = 15;  //não pode mudar porque é uma constante
        int asrn24678md;
        //int asrn246 78md; tem um espaço no nome da váriavel
        int asrn2$4678_md; //não apropriado usar o $ e o _
        //int asrn2$46%78_md = 10; caracteres especiais | como % não funcionam

        //valor inicial para cada uma das váriaveis

        asrn24678md = 100;
        asrn2$4678_md = 10;



        int quantidadeProduto = 50; //Atribuição correta
        //int QuantidadeProduto; não apropriada
        final int NUMERO_TENTATIVAS = 5; // regaras para constantes (final) | letras maiusculas e _ entre as palavras
        //final int numeroTentativa= 5; // constante não segue as regras de boas praticas
        int QUANTIDADE_OPCOES = 25; //não gera erro mias não segue as boas práticas
        //int qtdProd; funciona, porém a expressividade não foi aplicada

        //Mostrando os valores das váriaveis no console

        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);

        System.out.println(j);
        System.out.println(asrn24678md);
        System.out.println(asrn2$4678_md);

        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println(QUANTIDADE_OPCOES);


    }
}
