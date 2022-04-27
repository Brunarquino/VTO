package dio.operadoresaritméticos;

public class AulaTres {

    public static void main(String[] args) {

        //ultilizando os métodos

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
    }

    //Métodos

    private static void prePos() {

        int k = 10;

        int i = ++k; //pré-fixado
        int j = k--; //pós-fixado
        int x = k; //recebendo outras variaveis

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("x: " + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b; //Soma
        int r2 = c-a; //Subtração
        int r3 = d*b; //Multiflipacação
        int r4 = e/a; //divisão
        int r5 = c%b; //mod | resto da divisão

        System.out.println("a+b: " + r1);
        System.out.println("c-a: " + r2);
        System.out.println("d*b: " + r3);
        System.out.println("e/a: " + r4);
        System.out.println("c%b: " + r5);

    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f; //recebendo outras variaveis

        System.out.println("d: " + d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 5
        d /=2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;

        System.out.println("i: " + i);
        System.out.println("k: " + k);


    }

    private static void precedencia() {

        //mesclar os aritmeticos, prés e os pós fixados e atribuições para ver sua precedencia, qual opera primeiro

        int i = 10;
        int j = 20;
        int k = 30;



        int a = i++ + --j * k; //10 + 19 * 30 -> 10 + 570 -> 580

        System.out.println("a = i++ + --j * k: " + a);

        //somente depois da execução o a o i foi para 11

        System.out.println("i: " + i); // 11


        int b = k / --i % 3 + 1; // 30 / 10  % 3 + 1 -> 1

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        c*= i += 5; // c = 2 * i; i = i + 5 -> c = 2 * 1; i = 10 + 5; -> c = 2 * 15; -> c = 2 * 15; c = 30

        System.out.println("c*= i += 5: " + c);


    }

}
