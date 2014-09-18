/**
 * Created by chiwink on 9/18/2014.
 */
class Kalkulator{
    double tambah(double nilai1, int nilai2){
        return nilai1+nilai2;
    }

    int kurang(int nilai1, int nilai2){
        return nilai1-nilai2;
    }

    double kali(int nilai1, int nilai2){
        return nilai1*nilai2;
    }

    double bagi(int nilai1, int nilai2){
        return nilai1/nilai2;
    }

    double kaliVersi2(int nilai1, int nilai2){
        double hasil = 0;

        for(int i = 0; i < nilai2; i++){
            hasil = tambah(hasil, nilai1);
        }

        return hasil;
    }
}
