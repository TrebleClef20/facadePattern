import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Cart implements HotelService {

    private Integer numberOfCarts;

    @Override
    public boolean takeInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Cart Hotel Service requires an input");
        System.out.print("Number of carts: ");

        try {
            numberOfCarts = Integer.parseInt(scan.nextLine());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public void startService() {
        requestCart(numberOfCarts);
    }

    @Override
    public void reportDone() {
        System.out.println("Cart Hotel Service Report:");
        System.out.println("Successfully handled " + numberOfCarts + " luggage cart\\s");
    }

    public void requestCart(Integer numberOfCarts) {
        System.out.println("Checking cart requests");
        System.out.println("Preparing cart for luggages");

        System.out.println("Handling Carts:");

        Integer jump = numberOfCarts / 3;
        if (jump == 0)
            jump = 1;

        for (int i = 1; i < numberOfCarts; i += jump) {
            System.out.println("progress: " + i + " out of " + numberOfCarts);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("progress: " + numberOfCarts + " out of " + numberOfCarts);
    }
}
