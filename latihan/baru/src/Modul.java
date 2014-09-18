/**
 * Created by chiwink on 9/18/2014.
 */

public class Modul {
    String nama;
    int nilai;
    String email, password;

    void setNama(String namaBaru){
        this.nama = namaBaru;
    }

    void printNama(){
        System.out.print("Namanya adalah : "+this.nama);
    }

    void login(String inputEmail, String inputPassword){

        if(inputEmail.equalsIgnoreCase(this.email)
            && inputPassword.equals(this.password) ){

            System.out.print("Login sesuai, silahkan masuk");

        } else {

            System.out.print("Login tidak sesuai, silahkan ulangi");

        }
    }
}
