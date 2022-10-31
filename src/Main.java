import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<IPayment> staffs = new ArrayList<IPayment>();
        CEO ceoOne = new CEO("Krit",100000,6,5000);
        staffs.add(ceoOne);
        Developer devOne = new Developer("Bank",50000,20,5000);
        staffs.add(devOne);
        Marketing marketingOne = new Marketing("Ya",30000,4,1000);
        staffs.add(marketingOne);

        //Add a driver
        Driver driver1 = new Driver("Kim",500,3);
        staffs.add(driver1);
        //Add a cleaner
        Cleaner cleaner1 = new Cleaner("Keaw",20,350);
        staffs.add(cleaner1);
        //Add Rental
        Rental rental1 = new Rental("Rental",20000);
        staffs.add(rental1);
        //Add Electicity
        Electicity electicity1 = new Electicity("Electicity",25,60);
        staffs.add(electicity1);
        //Add internet
        Internet internet1 = new Internet("Internet Access",2500);
        staffs.add(internet1);


        int iPayment = 0;
        int iTax = 0;
        for (IPayment staff : staffs) {

            System.out.println(staff.getName() + " = " + staff.getPayment());
            iPayment += staff.getPayment();

        }
        System.out.println("-------------------------------------------------");
        for (ITax staff : staffs) {

            System.out.println(staff.getName() + " = " + staff.getTax());
            iTax += staff.getTax();

        }

        System.out.println("Total Payment: " + iPayment);
        System.out.println("Total Tax: " + iTax);
    }
}