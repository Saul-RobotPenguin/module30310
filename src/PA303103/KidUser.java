package PA303103;

public class KidUser implements  LibraryUser{
    int age;
    String bookType;

    KidUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (this.age <= 11){
     System.out.println("Sorry, age must be less than 12 to register as a kid");
        } else if ( age> 11){
     System.out.println("Oops, you are allwoed to take only kids books");
            }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Kids")){
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you're only allowed to take kids books ");
        }
    }
}
