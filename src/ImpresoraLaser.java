public class ImpresoraLaser extends Impresor {
    private int toner;
    public ImpresoraLaser(String modelo, int resolucion, int toner) { super(modelo, resolucion); this.toner = toner; }
    public void imprimirDocumento(String documento) {
        if (toner > 0) { System.out.println("Láser " + modelo + " imprime: " + documento); toner--; }
        else System.out.println("Tóner agotado.");
    }
}
