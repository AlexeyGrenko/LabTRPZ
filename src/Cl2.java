/**
 * Created by User on 29.03.2018.
 */
public class Cl2 implements If2 {
    Cl1 cl1;

    public Cl2() {
        cl1 = new Cl1();
    }
    @Override
    public void meth1() {
        System.out.println("Cl2 met1");
    }

    @Override
    public void meth2() {
        System.out.println("Cl2 met2");
    }
}
