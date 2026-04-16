import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Manusia a = new Manusia("Ana", false, "350781234", true);
        System.out.println(a);
        System.out.println();

        MahasiswaFILKOM b = new MahasiswaFILKOM("Putra", true, "3507954363", false, "165150300111100", 3.98);
        System.out.println(b);
        System.out.println();

        Pekerja c = new Pekerja("Jeonghan", true, "35073948572", true, 5000, LocalDate.of(2014, 10, 4), 2);
        System.out.println(c);
        System.out.println();

        Manager d = new Manager("Jaemin", true, "35078394576", false, 2500, LocalDate.of(2016, 8, 13), 0, "IT");
        System.out.println(d);
    }
}
