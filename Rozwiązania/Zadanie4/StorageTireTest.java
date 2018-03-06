/**
 * Created by jas on 2017-03-13.
 */
public class StorageTireTest
{
    public static void main(String[] args)
    {
        Tire tire1 = new Tire(201, 65, 27);
        Tire tire2 = new Tire(202, 65, 27);
        Tire tire3 = new Tire(203, 65, 27);

        StorageTire storageTire = new StorageTire();
        storageTire.addTire(tire1, 1, 1, 1);
        storageTire.addTire(tire2, 1, 1, 2);
        storageTire.addTire(tire3, 1, 1, 2);

        Tire tire4 = storageTire.getTire(1, 1, 1);
        System.out.println(tire4.getShortcut());

    }

}
