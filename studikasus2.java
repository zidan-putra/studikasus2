
package studikasus;
import java.util.Scanner;

public class studikasus2 {


    public static void main(String[] args) {
        
        pelanggaran langgar = new pelanggaran();
        System.out.println("== data pelanggaran siswa ==");
        langgar.daftarlanggar();
        
        System.out.println("masukan pelanggaran yang telah dilakuakan oleh siswa apabila selesai pilih 5");
        langgar.skors();
        
        System.out.println("banyak pelanggaran yang dilakukan adalah");
        System.out.println("=============");
        langgar.totalPelanggaran();
        System.out.println("=============");
        
        System.out.println("siswa mendapat skors sebesar "+langgar.totalSkors()+"\nsehingga");
        langgar.hukuman(langgar.totalSkors());
        
        
        
    }
    
}
class pelanggaran{
    String[] pelanggaran = {"berkelahi\tskor : 10", "pakaian tdk rapi\tskor : 5", "mencuri\tskor : 25", "rambut gondrong\tskor : 5"};
    int berkelahi, pakaian, mencuri, gondrong;
    
    void daftarlanggar(){
        for(int i = 0; i < pelanggaran.length ; i++){
            System.out.println((i+1)+". "+pelanggaran[i]);
        }
        
    }
    
    void skors(){
        Scanner input = new Scanner(System.in);
        
        
        
        do{
            int i = input.nextInt();
            if (i == 1){
                berkelahi++;
            }
            else if (i == 2){
                pakaian++;
            }
            else if (i == 3){
                mencuri++;
            }
            else if (i == 4){
                gondrong++;
            }
            else if (i == 5){
                break;
            }
        }while(true);
        
    }
    
    void totalPelanggaran(){
        System.out.println("berkelahi " +berkelahi+ " kali");
        System.out.println("pakaian tidak tapi "+pakaian+" kali");
        System.out.println("mencuri " +mencuri+ " kali");
        System.out.println("rambut gondrong " +gondrong+ " kali");
    }
    
    int totalSkors(){
        int total = (berkelahi*10)+(pakaian*5)+(mencuri*25)+(gondrong*5);
        return total;
    }
    
    void hukuman(int a){
        if(a < 25){
            System.out.println("siswa mendapat teguran lisan");
        }
        else if(a < 50){
            System.out.println("orang tua siswa dipanggil");
        }
        else if (a < 75){
            System.out.println("siswa dan orang tua siswa akan di panggil dan menanda tangani surat bermatrai");
        }
        else {
            System.out.println("siswa mbelajar dirumah selama 2 minggu");
        }
    }
}
