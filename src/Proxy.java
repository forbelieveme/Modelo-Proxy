
public class Proxy implements Calculadora{

    private CalculadoraConcreta calculadora = null;
    private int suma=0;

    public Proxy(int suma) {
        this.suma = suma;
    }

    @Override
    public int sumar(int a, int b) {
        if(calculadora==null){
            calculadora=new CalculadoraConcreta(suma);
        }
        
        return calculadora.sumar(a,b); 
    }

    
}
//class ProxyImage implements Image {
//
//    private RealImage image = null;
//    private String filename = null;
//    /**
//     * Constructor
//     * @param filename
//     */
//    public ProxyImage(final String filename) {
//        this.filename = filename;
//    }
//
//    /**
//     * Displays the image
//     */
//    public void displayImage() {
//        if (image == null) {
//           image = new RealImage(filename);
//        }
//        image.displayImage();
//    }
//
//}