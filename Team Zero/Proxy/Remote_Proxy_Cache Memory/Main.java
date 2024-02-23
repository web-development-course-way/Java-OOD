public class Main {
    public static void main(String[] args) {

         Proxy_Image image1 = new Proxy_Image("Image1") ;
         Proxy_Image image2 = new Proxy_Image("Image2") ;
         image1.displayImage();    // Image 1 will be loaded and displayed
         image2.displayImage();    // Image 2 will be loaded and displayed


         image1.displayImage();   // Image 1 is already loaded, so it will be displayed without loading again

    }
}
