import koneksi.Database;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;
public class Main{
  public static void main(String[] args){
    System.out.println("Ini program utama");
    Database.getConnection();
    Dosen.tampilanInfo();
    Mahasiswa.tampilanInfo();
    MataKuliah.tampilanInfo();
  }
}