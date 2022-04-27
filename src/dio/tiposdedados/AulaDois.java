package dio.tiposdedados;

public class AulaDois {

    public static void main(String[] args) {

        //valores inteiros com diferentes capacidades

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; ultrapassa o limite permitido, valor muito acima

        //int i1 = -10000000000; ultrapassa o limite permitido, valor muito abaixo
        int i2 = 28500;

        //

        long l1 = 1000000000000000000L; //variavel muito grande para ser inteiro é add o L no final, sem o L dá erro
        long l2 = 2004005000500055000L;

        //valores reais

        //float f1 = 4.5; tem que add o F sem o F é um double
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84D;

        //Tipos de dados Textuais

        char c1 = 'W';
        //char c2 = 'Tw'; somente 1 caractere
        char c3 = '\u0057'; //codígo unicode,  esse valor representa W

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag dgb se  se et t KNBJBJBB &*´´&%&  75894389";

        //String dt1 = "09/02/1981"; tipo de dado adequado, existe um tipo especifico para datas, para poder fazer outros tipos de operações

        //Valores lógicos

        boolean boo1 = true;
        boolean boo2 = false;

        //Mostrando os valores das variáveis

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(i2);
        System.out.println(b1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(boo1);
        System.out.println(boo2);

    }

}
