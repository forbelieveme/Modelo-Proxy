
public class CalculadoraConcreta implements Calculadora{

    private int suma;
    

    public CalculadoraConcreta(int suma) {
        this.suma = suma;
        cargarSuma();
    }

    public void cargarSuma(){
        System.out.println("Cargando suma...");
    }
    
    @Override
    public void sumar() {
        System.out.println("Sumado");
    }
    
}
//class RealImage implements Image {
//
//    private String filename = null;
//    /**
//     * Constructor
//     * @param filename
//     */
//    public RealImage(final String filename) {
//        this.filename = filename;
//        loadImageFromDisk();
//    }
//
//    /**
//     * Loads the image from the disk
//     */ 
//    private void loadImageFromDisk() {
//        System.out.println("Loading   " + filename);
//    }
//
//    /**
//     * Displays the image
//     */
//    public void displayImage() {
//        System.out.println("Displaying " + filename);
//    }
//
//}