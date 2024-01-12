/**
 * ehsan
 *
 */
/**
 * Innerehsan
 */

class ehs {
     
     ehs() {
        
       System.out.println("I am inside the constructor");
    }
     ehs(String name){
        System.out.println("good morning "+name);
    }

    
     void playMusic() {
        System.out.println("playing music.....");
    }



    


    public static void main(String[] args) { 
        ehs music = new ehs("ehsan e");
        
        
        

        music.playMusic();
    }
}
