
public interface Calculadora {
    public int sumar(int a, int b);
}

//interface Image {
//    public void displayImage();
//}
//
//// On System A
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
//
//// On System B
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
//
//class ProxyExample {
//
//   /**
//    * Test method
//    */
//   public static void main(final String[] arguments) {
//        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
//        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
//
//        image1.displayImage(); // loading necessary
//        image1.displayImage(); // loading unnecessary
//        image2.displayImage(); // loading necessary
//        image2.displayImage(); // loading unnecessary
//        image1.displayImage(); // loading unnecessary
//    }
//}