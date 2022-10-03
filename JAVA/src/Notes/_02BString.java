package Notes;

public class _02BString {

    static String name="x";
    static String surname="y";
    void intro(){
        System.out.println(name+" "+surname);
    }

    public static void main(String[] args) {
        _02AString obj=new _02AString();
        System.out.println(name+" "+surname);
        obj.intro("Nikhil", "Kharat");
    }
}
