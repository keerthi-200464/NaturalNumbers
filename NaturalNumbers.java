class RecursionDemo{
    static int SumNaturalNumbers(int n){
        if(n<=1){//base case 
        return 1;
        }else{
            return n + SumNaturalNumbers(n-1);
        }
}
public static void main(String[] args){
    int number = 10;
    int result = SumNaturalNumbers(number);
    System.out.println("Sum of First" + number + "natural numbers is" + result);
  }
}  
  