public class HotelApp {
    public static void main(String[] args) {

        // get the Hotel Services Ready
        HotelService valet = new Valet();
        HotelService houseKeeping = new HouseKeeping();
        HotelService cart = new Cart();

        System.out.println("""

                Welcome to SMT Hotel!
                Please proceed to check-in through our Front Desk.
                Enjoy your stay...

                """);

        // Selecting Valet Service
        FrontDesk frontDesk = new FrontDesk(valet);
        frontDesk.doService();

        // Selecting House Keeping Service
        frontDesk = new FrontDesk(houseKeeping);
        frontDesk.doService();

        // Selecting Cart Service
        frontDesk = new FrontDesk(cart);
        frontDesk.doService();

        System.out.println("""
                Thank you for choosing SMT Hotel!
                Till next time...
                """);
    }
}