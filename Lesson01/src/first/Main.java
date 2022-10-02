package first;

public class Main {
    public static void main(String[] args) {
        First a = new First("Hello World");
        System.out.println(a.str);    // public niteliğimize doğrudan eriştik. 
    }
}


// erişim belirleyici farkları:
//    public:     aynı veya farklı tüm package'lerden erişilebilir.
//    private:    aynı veya farklı hiçbir package'ten erişilemez.
//    protected:  yalnızca aynı packagten erişilebilir.