package first;

public class First {

    private String str;
    // erişim türü private olduğu için bu niteliğe ShowStr() metodu ile erişeceğiz
    // ileride bu metoda getStr diyeceğiz (getters and setters)

    First(String str) {
        this.str = str;
    }

    void ShowStr() {
        System.out.println(this.str);
    }

}
