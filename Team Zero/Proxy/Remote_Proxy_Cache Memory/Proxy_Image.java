public class Proxy_Image implements Image{
     private Image real_image ;
     private String nameFile ;

     public Proxy_Image( String nameFile ){

         this.nameFile = nameFile ;
     }

    public void displayImage() {
         if( real_image == null )
             real_image = new Real_Image(nameFile ) ;

         real_image.displayImage();
    }

}
