public class FizzBuzz {
    public static void main(String[] args) {
        boolean fzz;
        boolean bzz;
        String str;

        for(int i = 1; i <= 100; i++){
            fzz = (i%3 == 0);
            bzz = (i%5 == 0);
            if(fzz == true && bzz == true){
               str = "Fizzbuzz";
            }
            else if(fzz == true && bzz == false){
                str = "Fizz";
            }
            else if(fzz == false && bzz == true){
                str = "Buzz";
            }
            else{
                str = String.valueOf(i);
            }

            System.out.println(str);
        }
    }
}
