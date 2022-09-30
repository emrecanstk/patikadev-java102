package second;

import first.First;

public class Second {
    public static void main(String[] args) {
        First b = new First("hi");   // başka bir package'teki public sınıfımızdan nesne üretebildik.
        System.out.println(b.str);       // başka bir package'teki sınıftan türettiğimiz nesneye doğrudan değer atadık.
    }
}
