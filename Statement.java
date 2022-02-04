import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeader(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for each rental
            result += getFigure(each);
        }
        //add footer lines
        result += getOwned(aCustomer);
        result += getEarned(aCustomer);
        return result;
    }

    public abstract String getHeader(Customer aCustomer);

    public abstract String getFigure(Rental aRental);

    public abstract String getOwned(Customer aCustomer);

    public abstract String getEarned(Customer aCustomer);
}
