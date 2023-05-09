import java.util.HashMap;
import java.util.Scanner;

public class Main {
    String nama, kelas, matkulpraktikum;
    int nim;

    public Main(String nm, String kl, String mat, int ni){
        nama = nm;
        kelas = kl;
        matkulpraktikum = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Main> mhs = new HashMap<>();
        String input;
        Main data;

        mhs.put("1", new Main("Putri","3H","Stuktur Data",20211037));
        mhs.put("2", new Main("Agus", "3A","Matematika",202131233));

        System.out.println("Masukkan ID: ");
        input = in.nextLine();
        data = mhs.get(input);
        if (data!= null){
            System.out.println("Data Mahasiswa : " + data.nama + ", Kelas: " + data.kelas + ", Mata Kuliah: " + data.matkulpraktikum + "NIM: " + data.nim);
        }
    }
}