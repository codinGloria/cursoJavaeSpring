package secao12.updowncasting;

public class AlimentarAnimais {

    // transformar a super classe em subclasse
    // não tem a responsabilidade de saber qual animal está na lista
    // usando polimorfismo

    public static void alimentar(Animal animal){
        animal.comer();
        // só quero o downcasting quando for cachorro
        if (animal instanceof Cachorro){
            ((Cachorro) animal).latir();
        }
    }
}
