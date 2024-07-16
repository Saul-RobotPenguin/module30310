package PA303103;

public class AdultUser implements LibraryUser {
    int age;
    String bookType;

    AdultUser(int age, String bookType){
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (this.age >= 12){
            System.out.println("You have successfully registered as an adult");
        } else if ( age <= 11){
            System.out.println("Sorry age must be greater than 12 to be registered as an adult");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equals("Fiction")){
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you're only allowed to take Adult ficiton books ");
        }
    }
}


