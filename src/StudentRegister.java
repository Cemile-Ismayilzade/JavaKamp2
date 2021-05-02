
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Aysel
 */
public class StudentRegister {

    public void addName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ad, Soyadiniz : ");
        String Name = sc.nextLine();
    }

    public void addEposta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("E-Posta : ");
        String Eposta = sc.nextLine();
    }

    public void addPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Parola : ");
        sc = new Scanner(System.in);
        String password = sc.nextLine();
    }

    public void StudentLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giris yap-Kodlama.io");
        addEposta();
        addPassword();
    }

    public void StudentSignup() {
        System.out.println("Kayit ol-Kodlama.io");
        addName();
        addEposta();
        addPassword();
    }
}
