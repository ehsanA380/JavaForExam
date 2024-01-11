/**
 * methodInvocation
 */
// public class methodInvocation {
//     int sum (int a , int b){
//         return a+b;
//     }

//     public static void main(String[] args) {
//         methodInvocation obj = new methodInvocation();
//         int c = obj.sum(49, 9);
//         System.out.println(c);
//     }
// }

// Note => In case of  Arrays , the refference is passed. Same is the case for object passing to methods.

class class1{
    static void change(int [] arr, int val){
        arr[0]=val;
    }
    public static void main(String [] args){
        int [] marks = {33,55,77,23,46,63};
        change(marks, 500);
        System.out.println("The value of marks[0] after running chaage is : "+marks[0]);
    }
}