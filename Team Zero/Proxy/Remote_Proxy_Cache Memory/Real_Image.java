public class Real_Image implements Image {

    String filename ;
    public Real_Image( String filename ){
        this.filename = filename ;
        LoadingFromDisk() ;
    }

    private  void LoadingFromDisk(){
        System.out.println("Loading image" + filename );
    }

    public void displayImage(){
        System.out.println("Displaying image" + filename );
    }
}
