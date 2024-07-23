package secao13.unchecked;

public class ArrayIndexOutOfBoundsExample {

    // unchecked não precisa colocar o Throws
    public static void main(String[] args) {

        // tenta fazer, se não, lança erro.
        try {
            int[] array = { 1,2,3,4,5,6,7,8,9,10};
            System.out.println(array[100]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Não foi possível acessar essa posição do array.");
        } finally {
            // sempre aparece
            System.out.println("Passou aqui.");
        }



    }
}
