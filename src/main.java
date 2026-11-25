import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Impresor> impresoras = new ArrayList<Impresor>();
        impresoras.add(new ImpresoraLaser("LaserJet", 1200, 1));
        impresoras.add(new ImpresoraTinta("DeskJet", 600, 0));
        for (Impresor impresor : impresoras) {
            impresor.imprimirDocumento("Informe de ventas");
            impresor.imprimirDocumento("Segunda página");
        }
    }
}
