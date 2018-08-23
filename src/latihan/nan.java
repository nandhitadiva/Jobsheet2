/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author WINDOWS 10
 */
public class nan {
    public static void main(String args[]){
            BiodataDiri dhi = new BiodataDiri();
            dhi.setnamaAyah("Arif Hariono");
            dhi.setnamaIbu("Indah Subrati");
            dhi.setnama("Nandhita Diva Azzahra");
            dhi.setnamaSaudara("Muhammad Rakha Ananda Pasha");
            dhi.setalamat("Jln Sawojajar gang 19");
            dhi.sethobi("Menggambar");
            dhi.setcitacita("Dokter");
            dhi.setumur(16);
            
            System.out.println("  -----Biodata Keluarga----- ");
            System.out.println("Nama Ayah       : "+ dhi.getnamaAyah()); 
            System.out.println("Nama Ibu        : " + dhi.getnamaIbu());
            System.out.println("Nama Sendiri    : " + dhi.getnama());
            System.out.println("Nama Saudara    : " + dhi.getnamaSaudara());
            System.out.println("Alamat          : " + dhi.getalamat());
            System.out.println("Hobi            : " + dhi.gethobi());
            System.out.println("Citacita        : " + dhi.getcitacita());
            System.out.println("Umur            : " + dhi.getumur());
    }
}