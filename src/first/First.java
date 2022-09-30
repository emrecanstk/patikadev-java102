package first;

public class First {

    private String str;
    // erişim türü private olduğu için bu niteliğe ShowStr() metodu ile erişeceğiz
    // ileride bu metoda getStr diyeceğiz (getters and setters)

    First(String str) {
        this.str = str;
    }

    private void ShowStr() {
        // methodu private belirleyip başka bir method aracılığıyla ulaşabiliriz.
        System.out.println(this.str);
    }

    void show() {
        // bu method ile ShowStr() methoduna dışarıdan erişim sağlayabiliyoruz.
        this.ShowStr();
    }
}
