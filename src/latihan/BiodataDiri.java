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
public class BiodataDiri {
    private String nama;
    private String alamat;
    private String hobi;
    private String citacita;
    private int umur;
    private String namaAyah;
    private String namaIbu;
    private String namaSaudara;
    
    public String getnamaAyah(){
        return namaAyah;
    }
    public String getnamaIbu(){
        return namaIbu;
    }
    public String getnama(){
        return nama;
    }
    public String getnamaSaudara(){
        return namaSaudara;
    }
    public String getalamat(){
        return alamat;
    }
    public String gethobi(){
        return hobi;
    }
    public String getcitacita(){
        return citacita;
    }
    public int getumur(){
        return umur;
    }
    
    
    
    public void setnamaAyah(String newnamaAyah){
        namaAyah = newnamaAyah;
    }
    public void setnamaIbu(String newnamaIbu){
        namaIbu = newnamaIbu;
    }
    public void setnama(String newnama){
        nama = newnama;
    }
    public void setnamaSaudara(String newnamaSaudara){
        namaSaudara = newnamaSaudara;
    }
    public void setalamat(String newalamat){
        alamat = newalamat;
    }
    public void sethobi(String newhobi){
        hobi = newhobi;
    }
    public void setcitacita(String newcitacita){
        citacita = newcitacita;
    }
    public void setumur(int newumur){
        umur = newumur;
    }
}
