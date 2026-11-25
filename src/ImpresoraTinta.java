public class ImpresoraTinta extends Impresor {
    private int tinta;
    public ImpresoraTinta(String modelo, int resolucion, int tinta) { super(modelo, resolucion); this.tinta = tinta; }
    public void imprimirDocumento(String documento) {
        if (tinta > 0) { System.out.println("Inyección de tinta " + modelo + " imprime: " + documento); tinta--; }
        else System.out.println("Cartucho agotado.");
    }
}
