public class Student {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    //private double average; (tidak perlu digunakan)

    private static int jumlahObjek = 0; //variabel untuk menghitung objek

    //default constructor
    public Student(){//constructor harus sama dengan nama class
        name = "";
        address = "";
        age = 0;
        jumlahObjek++; //tambah 1 setiap kali objek dibuat
}
//constructor dengan parameter nama, alamat, dan usia
public Student(String n, String a, int ag){
    name = n;
    address = a;
    age = ag;
    jumlahObjek++; //tambah 1 setiap kali objek dibuat
}

//constructor untuk mengisi semua parameter termasuk nilai mapel
public Student(String n, String a, int ag, double math, double english, double science) {
    name = n;
    address = a;
    age = ag;
    mathGrade = math;
    englishGrade = english;
    scienceGrade = science;
    jumlahObjek++; //tambah 1 setiap kali objek dibuat

}

public void setName(String n){
    name = n;
}

public void setAddress(String a){
    address = a;
}

public void setAge(int ag){
    age = ag;
}

public void setMath(int math){
    mathGrade = math;
}

public void setEnglish(int english){
    englishGrade = english;
}

public void setScience(int science){
    scienceGrade = science;
}
//method untuk menghitung nilai rata-rata
private double getAverage(){
    double result = 0;
    result = (mathGrade+scienceGrade+englishGrade)/3.0;
    return result;
}

//Method untuk menentukan siswa remidi atau tidak
public boolean statusAkhir(){
    return getAverage() >= 61; //Jika rata-rata >=61, Lolos(true), Remidi (false)

}

//Method untuk menampilkan informasi siswa
public void displayMessage(){
    System.out.println("Siswa dengan nama "+name);
    System.out.println("beralamat di: "+address);
    System.out.println("berumur "+age);
    System.out.println("mempunyai nilai rata rata: " +getAverage()); //harus memanggil method getAverage
    System.out.println("Status akhir:" +(statusAkhir() ? "Lolos" : "Remidi"));
}

public static void jumlahObjek(){
    System.out.println("Jumlah total objek yang dibuat: " + jumlahObjek);
}
}