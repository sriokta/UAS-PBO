/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author acer
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mahasiswa umby = new mahasiswa();
        umby.setJurusan("psikologi");
        umby.setMatkul("psikologi dasar");
        umby.setNama("Oka");
        umby.setNim("127355");
        System.out.println("Nama          :"+umby.getNama());
        System.out.println("NIM           :"+umby.getNim());
        System.out.println("Jurusan       :"+umby.getJurusan());
        System.out.println("Mata Kuliah   :"+umby.getMatkul());
    }
    
}
