package edu.luiz.primeirasemana;

public class SomaDoisNumeros {

    public static void main (String[] args) {
        int num1 = 23;
        int num2 = 25;

        int soma = somarNumeros(num1, num2);

        //System.out.println("A soma de " + num1 + " + " + num2 + " é: " + soma);

        char letra_J = 74;
        char letra_P = 80;

        System.out.printf("%c %c\n", letra_J, letra_P);
    }

    public static int somarNumeros (int numero1, int numero2) {
        int soma = numero1 + numero2;

        return soma;
    }

}
