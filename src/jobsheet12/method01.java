package jobsheet12;

public class method01 {
    public static int hitung(int a, int b){
        int c = a + b;
        return c;
    }
    
    public static void main(String[] args) {
        int x;
        int bil1= 32, bil2 = 17;
        
        x = hitung(bil1, bil2);
        
        System.out.println("Hasil : " + x);
    }
}
