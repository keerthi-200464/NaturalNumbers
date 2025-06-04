class RecursionDemo{
static int fibonacci(int n){
    if(n==1){//base case1
    return 0;
    }else if(n==1){//base case2
    return 1;
    }else{
        return fibonacci(n-1) + fibonacci(n-2);//recursive call
    } 
  }
public static void main(String[] args){
    int  terms = 7;
    System.out.println("Fibonacci Series");
    for(int i = 0;i<terms;i++){
        System.out.print(fibonacci(i)+"");
    }
   }
}   
    