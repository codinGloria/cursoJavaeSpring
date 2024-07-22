package secao12;

// Quando a conversão é feita de forma automática
public class Widening {

    public static void main(String[] args) {

        int variavelInt = 123;
        long variavelLong = variavelInt;

        System.out.println(variavelInt);
        System.out.println(variavelLong);

        // o valor é armazenado em um container maior e o espaço extra a esquerda é preenchido com zeros
        // quando passamos valores inteiros para flutuantes, ocorre a mesma coisa (não a perca de informações)

        float variavelFloat = variavelLong;
        double variavelDouble = variavelLong;

        System.out.println(variavelFloat);
        System.out.println(variavelDouble);

        // byte -> short -> int -> long -> float -> double

    }
}
