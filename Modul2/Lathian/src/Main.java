import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();
        hewan.addAll(List.of("Sapi","Kelinci","Kambing","Unta","Domba"));
        System.out.println("Hewan: "+ hewan);
        System.out.println("Hewan Yang Dihapus:");
        DeleteHewan.addAll(List.of("Kelinci","Kambing","Unta"));
        System.out.println(DeleteHewan);
        hewan.removeAll(List.of("Kelinci","Kambing","Unta"));
        System.out.println("Output Hewan:");
        System.out.println(hewan);
    }
}