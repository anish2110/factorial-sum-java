import java.util.Scanner;

class Sum{
    public static void main(String [] ak){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter the number: ");
        int num = scan.nextInt();
        
        System.out.println("Sum: "+sum(num));
    }
    
    public static int sum(int k){
        if(k > 0) {
            return k + sum(k - 1);
        }
        else{
            return 0;
        }
    }
}