package Assg;

public class _09Array2 {
    static boolean isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }if(count==2){
            return true;
        }else{
            return false;
        }
    }

    public String findAndReturnPrimeNumbers(int[] arr){
//write the logic to iterate through the supplied inputArray and return array of prime
        String flag="";
        for (int i=0;i<arr.length;i++){
            if (isPrime(arr[i])){
                flag+=arr[i]+" ";
            }
        }return flag;
//if no prime number is found then return the empty array.
    }

    public static void main(String[] args){
        _09Array2 obj =new _09Array2();
//Create the object of Main class
//on the object of Main class call the findAndReturnPrimeNumbers method
//by supplying the following array as the parameter
        int[] arr = {10,12,50,14,15};
        if(obj.findAndReturnPrimeNumbers(arr).equals("")){
            System.out.println("Prime No Not found");
        }else{
            System.out.println(obj.findAndReturnPrimeNumbers(arr));
        }
//print each element from the returned array of findAndReturnPrimeNumbers method
//if findAndReturnPrimeNumbers method returns an empty array then print the following

// "Prime number not found in the supplied Array"
    }

}
