package polymorphims;
import javax.swing.JFrame;
//Penggunaan 2 Class
//pengenalan polymorphisms
public class running {
    public static void main(String[] args) {
        DosenClass Dosen[] = new DosenClass[2];
        Dosen[0] = new ClassDua();
        Dosen[1] = new ClassTiga();
        
        for (int i =0 ; i<2; ++i){
            Dosen[i].tinggi();
        }
    }
    
}