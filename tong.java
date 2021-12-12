package mang;

public class tong {
    public int tinhTong(int a, int b) {
        return a + b;
    }

    int hieu(int a, int b) {
        return a - b;
    }

    double tich(int a, int b) {
        return (double) a / b;
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        tong m = new tong();
        int sum = m.tinhTong(a, b);
        int sub = m.hieu(a, b);
        double tich = m.tich(a, b);
        System.out.println(sub);
        System.out.println(sum);
        System.out.println(tich);
    }
}
