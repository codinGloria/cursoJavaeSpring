package secao12.updowncasting;

public class Cachorro extends Animal{

    @Override
    public void comer(){
        super.comer();
    }

    public void latir(){
        System.out.println("Latindo!");
    }
}
