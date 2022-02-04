public class TextStatement extends Statement {
     public String getHeader(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    public String getFigure(Rental aRental) {
        return "\t" + aRental.getMovie().getTitle()+ "\t" + String.valueOf(aRental.getCharge()) + "\n";
    }

    public String getOwned(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    }

    public String getEarned(Customer aCustomer) {
        return "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    }
}