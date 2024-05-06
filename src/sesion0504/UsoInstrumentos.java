package sesion0504;

public class UsoInstrumentos {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Saxofon saxofon = new Saxofon();
        Violin violin = new Violin();
        guitarra.tocar();
        saxofon.tocar();
        violin.tocar();
    }
}
