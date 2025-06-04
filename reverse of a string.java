class RecursionDemo{
    static String reverse(String Str){
        if(Str.isEmpty()){
            return Str;
        }else{
            return reverse(Str.substring(1)) + Str.charAt(0);
        }
    }
    public static void main(String[]args){
        String S = "hello";
        System.out.println("Reversed String:" + reverse(S));
    }
}
