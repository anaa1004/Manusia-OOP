import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //MANUSIA
        System.out.println("=== Manusia ===");
        Manusia a1 = new Manusia("Ihza", true, "350788754", true);
        System.out.println(a1);
        System.out.println();

        Manusia a2 = new Manusia("Ana", false, "350781234", true);
        System.out.println(a2);
        System.out.println();

        Manusia a = new Manusia("Nana", false, "350781234", false);
        System.out.println(a);
        System.out.println();

        //MAHASISWA FILKOM
        System.out.println("=== Mahasiswa Filkom ===");
        MahasiswaFILKOM b1 = new MahasiswaFILKOM("Raka", true, "35079587653", false, "2551507001230001", 2.4);
        System.out.println(b1);
        System.out.println();
        MahasiswaFILKOM b2 = new MahasiswaFILKOM("Tri", false, "35079546363", false, "2551507001870002", 3.35);
        System.out.println(b2);
        System.out.println();
        MahasiswaFILKOM b3 = new MahasiswaFILKOM("Febri", false, "3507954363", false, "255150700111010", 3.87);
        System.out.println(b3);
        System.out.println();

        //PEKERJA
        System.out.println("=== Pekerja ===");
        Pekerja c1 = new Pekerja("Jeonghan", true, "35073948572", true, 5000, LocalDate.now().minusYears(2), 2);
        System.out.println(c1);
        System.out.println();
        Pekerja c2 = new Pekerja("Putra", true, "35073947689", true, 5000, LocalDate.now().minusYears(9), 0);
        System.out.println(c2);
        System.out.println();
        Pekerja c3 = new Pekerja("Anton", true, "35073943457", true, 5000, LocalDate.now().minusYears(20), 10);
        System.out.println(c3);
        System.out.println();

        //MANAGER
        System.out.println("=== Manager ===");
        Manager d = new Manager("Jaemin", true, "35078394576", false, 7500, LocalDate.now().minusYears(15), 0, "IT");
        System.out.println(d);
    }
}
