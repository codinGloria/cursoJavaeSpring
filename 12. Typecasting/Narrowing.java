package secao12;

public class Narrowing {

    public static void main(String[] args) {

        //nesse tipo de typecasting nós convertemos manualmente um tipo de dados para outro usando o tipo desejado entre ()
        //usado para tipos de dados menores, pois a informação pode se perder.
        // double -> float -> long -> int -> short -> byte

        //double -> int
        double meuDouble = 2.84;
        System.out.println(meuDouble);

        int meuInt = (int) meuDouble;
        System.out.println(meuInt);

        // double e int -> string
        String minhaStringInt = String.valueOf(meuInt);
        String minhaStringDouble = String.valueOf(meuDouble);

        System.out.println(minhaStringInt);
        System.out.println(minhaStringDouble);

        // string -> primitivo
        // usamos wrappers
        String s = "1";
        boolean meuBoolean = Boolean.parseBoolean(s);
        System.out.println(meuBoolean);

        // string -> float
        float meuFloat = Float.parseFloat(s);
        System.out.println(meuFloat);

        // string -> int
        int meuNovoInt = Integer.parseInt(s);
        System.out.println(meuNovoInt);

        // string -> short
        short meuShort = Short.parseShort(s);
        System.out.println(meuShort);

        // string -> long
        long meuLong = Long.parseLong(s);
        System.out.println(meuLong);

        // string -> double
        double meuNovoDouble = Double.parseDouble(s);
        System.out.println(meuNovoDouble);

        // string -> byte
        byte meuByte = Byte.parseByte(s);
        System.out.println(meuByte);
    }
}
