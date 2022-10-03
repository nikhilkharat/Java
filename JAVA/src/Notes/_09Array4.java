package Notes;

public class _09Array4 {

    public int  high(){
        int [] num={10,20,30,15,7,35,28,4,6};
        int x=0;
        for (int i=0;i<num.length;i++){
            if(num[i]>x){
                x=num[i];
            }
        }
        return x;
    }

    public static void main(String[] args) {
        _09Array4 obj=new _09Array4();
        System.out.println(obj.high());
    }
}
