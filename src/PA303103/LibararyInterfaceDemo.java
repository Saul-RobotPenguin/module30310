package PA303103;

public class LibararyInterfaceDemo {
    public static void main(String[] args) {
        KidUser Pete = new KidUser(10, "Kids");
        KidUser Steve = new KidUser(18, "Fiction");


        Pete.registerAccount();
        Steve.requestBook();


        AdultUser bigPete = new AdultUser(5 , "Kids");
        AdultUser bigSteve = new AdultUser(23, "Fiction");


        bigPete.registerAccount();
        bigSteve.requestBook();


    }
}
