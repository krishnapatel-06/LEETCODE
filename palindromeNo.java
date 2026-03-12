import java.util.Scanner;
class A{
public boolean isPalindrome(){
    System.out.println("enter no : ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if(x < 0){
        return false;
    }
    int original = x;
    int rev = 0;

    while(x !=0){
        int digit = x % 10;
        rev = rev * 10 + digit;
        x = x / 10;
    }
    if(original == rev){
    return true; 
    }else{
    return false;
    }
}
}
public class palindromeNo {
    public static void main(String[] args){
        A obj = new A();
        System.out.println(obj.isPalindrome());
    }
}
