import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      bai1();
      bai2();
      bai3();
      bai4();
    }
    public static void bai1()
    {
        System.out.println("Bai 1 : Tinh Diem Trung Binh mon :Vật Lý, Hóa Học, Sinh Hoc.");
        double ly,hoa,sinh,Tong,tbc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Diem mon Ly");
        ly=sc.nextDouble();
        System.out.println("Nhap Diem Mon Hoa");
        hoa=sc.nextDouble();
        System.out.println("Nhap Diem Mon Sinh");
        sinh=sc.nextDouble();
        System.out.println("Vay Tong La : " +(Tong=(ly+hoa+sinh)));
        System.out.println("Diem Trung Binh la : "+(tbc=(Tong/3)));

    }
    public static void bai2() {
        System.out.println("Bai 2 :  nhập một giá trị là độ 0C (Celsius) và chuyển nó sang độ 0F (Fahrenheit)");
        double C,F;
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập Độ C");
        C=sc.nextDouble();
        F=(C*1.8)+32;
        System.out.println("Do F sau khi chuyen doi la "+F);
    }
    public static void bai3(){
        System.out.println("Bai 3: Tinh Chu vi va Dien Tich Hinh tron ");
        double S,CV,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Ban kinh ");
        r=sc.nextDouble();
        System.out.println("Vay Dien Tich la "+(S=(r*r*3.14)));
        System.out.println("Vay Chu Vi la "+(CV=(2*r*3.14)));
    }
    public static void bai4()
    {
        System.out.println("Bai 4: Nhap vao Nam sinh cua mot nguoi va tinh tuoi cua nguoi do ");
        int nsinh,tuoi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap Nam Sinh");
        nsinh=sc.nextInt();
        System.out.println("Vay Tuoi Nguoi Do la "+(tuoi=(2018-nsinh)));
    }

}
