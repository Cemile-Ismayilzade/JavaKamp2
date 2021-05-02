
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(" Islemlerden biriniz seciniz:    "
                + "1.Giris yap      2.Kayd-ol");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            StudentRegister register1=new StudentRegister();
        register1.StudentLogin();
        }
        else if(option==2){
            StudentRegister register1=new StudentRegister(); 
            register1.StudentSignup();
        }else
        {
            System.out.println("1 ve ya 2 girmediginiz icin islem durduruldu!!!");  
        }
        System.out.println("Catagory :");
        Catagory catagory1 = new Catagory(1, "Tümü");
        Catagory catagory2 = new Catagory(2, "Programlama");
        Catagory[] catagorys = {catagory1, catagory2};
        for (Catagory catagori : catagorys) {
            System.out.println(catagori.number + "," + catagori.catName);
        }
        System.out.println("------------------------------------------------");
        System.out.println("Egitmen :");
        Instructor instructor1 = new Instructor(1, "Tumu");
        Instructor instructor2 = new Instructor(2, "Engin Demirog");
        Instructor[] instructors = {instructor1, instructor2};
        for (Instructor instructo : instructors) {
            System.out.println(instructo.numb + "," + instructo.InsName);
        }
        System.out.println("-----------------------------------------------");

        Courses find1 = new Courses(1, "C#+Angular", "Engin Demirog");
        Courses find2 = new Courses(2, "Java+React", "Engin Demirog");
        Courses find3 = new Courses(3, " Temel kurs", "Engin Demirog");
        Courses[] finds = {find1, find2, find3};
        for (Courses find : finds) {
            System.out.println(find.id + "," + find.cName + "," + find.Instructor);

        }

         
    }

}
