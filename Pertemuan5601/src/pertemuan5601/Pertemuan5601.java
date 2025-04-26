
package pertemuan5601;

/**
 *
 * @author LAB F
 * TGL: 26-04-2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        buah apel = new buah();
        apel.warna = "Hijau";
        apel.Setrasa("Manis");
        
        System.out.printf("warna Apel diset %s\n",apel.warna );
        System.out.printf("rasa Apel diset %s\n",apel.getRasa() );
       
        buah anggur = new buah();
        anggur.warna ="Hitam";
        anggur.Setrasa("Tidak Semanis Senyumanku");
        
        System.out.printf("warna anggur diset %s\n",anggur.warna );
        System.out.printf("rasa anggur diset %s",anggur.getRasa() );
        
        
    }
    
}

class buah{ 
    public String warna;
    private String rasa;
    
    public void Setrasa(String txRasa) {
        this.rasa = txRasa;
    }
    public String getRasa(){
        return this.rasa;
        
    }
    
}

