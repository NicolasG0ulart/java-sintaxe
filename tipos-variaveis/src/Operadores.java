public class Operadores {
    public static void main(String[] args) {
        // int numero = 5;
        // numero = - numero;
        // numero = + numero * -1;

        //incremento // decremento
        // int numero = 5;
        // numero++;
        // System.out.print(numero);


        // !!
        // boolean variavel = true;
        // variavel = !variavel;
        // System.out.print(variavel);



        // Ternário
        // int a, b;
        // a = 6;
        // b = 6;
        // String resultado = a==b ? "verdadeiro" : "falso";
        // System.out.print(resultado);



        //Relacionais
        // int numero1 = 1;
        // int numero2 = 2;
        // boolean simNao = numero1 == numero2;
        // System.out.println("NumeroUm é igual a numeroDois? " + simNao);
        // simNao = numero1 != numero2;
        // System.out.println("NumeroUm é diferente a numeroDois? " + simNao);

        //Lógico
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && (7 > 4)){
            System.out.println("as duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

    }
}
