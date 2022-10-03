package Notes;

public class _11BankDemo {

    public static void main(String[] args) {
        _11AbBank obj=new _11ICICI();
        _11AbBank obj1=new _11PNB();
        _11AbBank obj2=new _11SBI();

        System.out.println("Rate of Interest of PNB Bank is "+obj1.getRateOfInterest()+"%");
        System.out.println("Rate of Interest of SBI Bank is "+obj2.getRateOfInterest()+"%");
        System.out.println("Rate of Interest of ICICI Bank is "+obj.getRateOfInterest()+"%");

    }
}
