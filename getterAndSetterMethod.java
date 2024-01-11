/**
 * getterAndSetterMethod
 */
public class getterAndSetterMethod {

    public int id;
    public String name;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        System.out.println(id);
        return id;
    }
    public String getName() {
        System.out.println(name);
        return name;
    }
    public static void main(String[] args) {
        getterAndSetterMethod s= new getterAndSetterMethod();
        s.setId(9090);
        s.setName("Ehsan Ansari");
        s.getId();
        s.getName();
    }
}