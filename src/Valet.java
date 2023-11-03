import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Valet implements HotelService {

    private String plateNumber;

    @Override
    public boolean takeInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Valet Hotel Service requires an input");
        System.out.print("Platenumber: ");

        plateNumber = scan.nextLine();

        return plateNumber.length() != 0;
    }

    @Override
    public void startService() {
        pickUpVehicle(plateNumber);
    }

    @Override
    public void reportDone() {
        System.out.println("Valet Hotel Service Report:");
        System.out.println("Successfully parked and picked-up car: " + plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Receiving key to car: " + plateNumber);

        System.out.println("Starting Car");

        for (int i = 0; i < 3; i++) {
            System.out.println("Parking please wait....");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Turning off Car");
    }
}
