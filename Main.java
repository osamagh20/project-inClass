import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your user , 1 for manager , 2 for cashier , 0 for exit");
            choice = scanner.nextInt();
            if(choice == 1){
                manager(list);
            } else if (choice == 2) {
                cashier(list);
            }

        }while (choice !=0);



    }

    public static void manager(ArrayList <String> list){
        System.out.println("You are manager");
        Scanner scanner = new Scanner(System.in);

        int option;
        do{
            System.out.println("Enter number of function or zero for exit ");
            System.out.println("1- add , 2- delete , 3- modify , 4- print");
            option = scanner.nextInt();
            if(option == 1){
                addItem(list);
            }else if(option == 2){
                deleteItem(list);
            }else if(option == 3){
                modifyItem(list);
            }else if(option == 4){
                printItems(list);
            }

        }while(option != 0);
    }

    public static void addItem(ArrayList <String> list){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select number of books to be added ...");
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.println("Enter book title");
            String title = scanner.next();
            list.add(title);

        }


    }

    public static void deleteItem(ArrayList <String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to delete");
        int i = scanner.nextInt();
        for (int j = 0; j < i; j++) {
            System.out.println("Enter name of books to delete");
            String title = scanner.next();
            list.remove(title);

        }
    }

    public static void printItems(ArrayList <String> list){
        for (String books : list) {
            System.out.println("Name of book : "+books);
        }
    }


    public static void modifyItem(ArrayList <String> list){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter book title");
        String title = scanner.next();
        System.out.println("Enter new book ");
        String newTitle = scanner.next();
        list.set(list.indexOf(title), newTitle);
    }

    public static void cashier(ArrayList <String> list){
        System.out.println("You are cashier");
        buyItem(list);

    }
    public static void buyItem(ArrayList <String> list){
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.println("Enter 1 for buy or zero for exit from cashier");
            number = scanner.nextInt();
            if(number == 1){
                System.out.println("Enter book title");
                String title = scanner.next();
                if(list.contains(title)){
                    System.out.println("Bill\n" +
                            "The name of book : "+ title+"\nThe quantity : "+1);
                    list.remove(title);
                }

            }
        }while(number != 0);


    }
}