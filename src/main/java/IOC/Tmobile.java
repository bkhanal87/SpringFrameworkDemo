package IOC;

public class Tmobile implements Sim{

    @Override public void calling()
    {
        System.out.println("Tmobile calling");
    }
    @Override public void data()
    {
        System.out.println("Tmobile Data");
    }
}
