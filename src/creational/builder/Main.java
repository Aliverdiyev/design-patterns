package creational.builder;

public class Main {
    static void main(){
        User u = new User.Builder("Ali").age(20).build();
        System.out.println(u);
    }
}
