package secao12;

public class AutoAndUnboxing {

    public static void main(String[] args) {

        // autobixing é a conversão de um valor primitivo (int, double...) em um wrapper correspondente
        int valorInt = 10;
        Integer integer = valorInt;
        System.out.println(integer);

        // unboxing faz o caminho inverso
        Integer wrapperInteger = 14;
        int primitivoInteger = wrapperInteger;
        System.out.println(wrapperInteger);

        // OBS: sempre que possível usar tipos primitivos.
    }
}
