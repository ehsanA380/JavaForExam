/**
 * recursion
 */
public class recursion {
    static int factorial(int n){
        if(n==0|| n==1){
            return n;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static void pattern_rec(int n){
        if(n>0){
            pattern_rec(n-1);
            for(int i=0; i<n; i++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x=5;
        System.out.println("the value of factorial n is : "+ factorial(x));
        pattern_rec(5);
    }
}