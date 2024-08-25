import java.util.*;
// import com.contact;

public class contactrun {
    public static void main(String[] args) {
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("===========WELCOME TO THE CONTACT MANAGEMENT SYSTEM===========");
        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println();

        Scanner sin = new Scanner(System.in);
        System.out.println("Enter How Many Entries Of contact You Want To Enter In Database");
        int n = sin.nextInt();
        contact c[] = new contact[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = new contact();
        }

        boolean bc = true;
        while (bc) {
            System.out.println("1 for display all contact");
            System.out.println("2 for search contact by mobile number");
            System.out.println("3 for search by first name");
            System.out.println("4 sor search by last name");
            System.out.println("5 for edit in exicting contact");
            System.out.println("6 for display all contact of simcard");
            System.out.println("7 for display all contact of phone");
            System.out.println("8 for exit");
            int sw = sin.nextInt();
            switch (sw) {

                case 1: {
                    for (int i = 0; i < c.length; i++) {
                        c[i].display();
                    }
                    break;
                }

                case 2: {

                    c[0].search_contact(c);
                    break;
                }

                case 3: {

                    c[0].search_firstname(c);
                    break;
                }

                case 4: {

                    c[0].search_lastname(c);
                    break;
                }

                case 5: {

                    c[0].editdetails(c);
                    break;
                }

                case 6: {

                    c[0].displaysim(c);
                    break;
                }

                case 7: {

                    c[0].displayphone(c);
                    break;
                }
                case 8: {
                    bc = false;
                    break;
                }

                default: {
                    System.out.println("*****enter valid value*****");
                }

            }
        }

        System.out.println("==============================================================");
        System.out.println("==============================================================");
        System.out.println("====================THANKS FOR VISITING US====================");
        System.out.println("==============================================================");
        System.out.println("==============================================================");

    }

}
