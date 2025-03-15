import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("===DATA AWAL===");
        //Menggunakan constructor langsung agar tidak menambah jumlahObjek
        Student anna = new Student("Anna", "Batu", 20);
        anna.setMath(100);
        anna.setScience(89);
        anna.setEnglish(80);
        
        System.out.println("===================");
        //menggunakan constructor dengan nama, alamat, dan usia
        Student chris = new Student("Chris", "Kediri", 21);
        chris.setMath(70);
        chris.setScience(60);
        chris.setEnglish(90);
        chris.displayMessage();


        System.out.println("===================");
        //membuat objek menggunakan constructor dengan parameter lengkap
        Student budi = new Student("Budi", "Jakarta", 19, 85, 75, 95);
        budi.displayMessage();
        System.out.println("===================");

        //input jumlah siswa dari user
        System.out.println("Masukkan jumlah siswa:");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        //membuat array untuk menyimpan ojek Student
        Student[] siswaArray = new Student[jumlahSiswa];

        //input data siswa dari user
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan data untuk siswa ke-" + (i+1));

            System.out.print("Nama: ");
            String name = scanner.nextLine();

            System.out.print("Alamat: ");
            String address = scanner.nextLine();

            System.out.print("Usia: ");
            int age = scanner.nextInt();

            System.out.print("Nilai Matematika: ");
            double math = scanner.nextDouble();

            System.out.print("Nilai Bahasa Inggris: ");
            double english = scanner .nextDouble();

            System.out.print("Nilai IPA: ");
            double science = scanner.nextDouble();
            scanner.nextLine();

            //menyimpan data siswa ke dalam array
            siswaArray[i] = new Student(name, address, age, math, english, science);
            System.out.println("===================");
        }

            //Menampilkan semua data siswa yang dimasukkan user
            System.out.println("\n=== DAFTAR SISWA DARI INPUT USER===");
            for (Student siswa : siswaArray){
                siswa.displayMessage();
            }
            //Menampilkan perubahan informasi pada objek anna tanpa membuat objek baru
            System.out.println("===================");
            anna.setAddress("Batu");
            anna.setAge(18);
            anna.displayMessage();//Menampilkan perubahan alamat dan umur anna tanpa menambah jumlahObjek
            
        //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        System.out.println("===================");
        chris.setAddress("Surabaya");
        chris.setAge(22);
        chris.displayMessage();

        //Menampilan jumlah total objek yang dibuat
        System.out.println("\n=== INFORMASI JUMLAH OBJEK===");
        Student.jumlahObjek(); 

        scanner.close();
}
}