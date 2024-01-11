/**
 * methodOverlaoading
 */
public class methodOverlaoading {
    
    static void foo(){
        System.out.println("Good morning bro ");
    }
    static void foo(int a){
        System.out.println("good mornig " + a + " bro");
    }
    public static void main(String[] args) {
        
        foo();
        foo(300);
    }
}
