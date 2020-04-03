import java.util.ArrayList;
import java.util.Scanner;
public class Library {

    public static void main(String[] args){
        Scanner Author = new Scanner(System.in);
        System.out.println("Enter the authors first initial: ");
        String author = Author.nextLine();
        Scanner Title = new Scanner(System.in);
        System.out.println("What is the first letter of the title of your book: ");
        String title = Title.nextLine();

        ArrayList<Book> books = populateLibrary();
        books.parallelStream().filter(book ->{
            return book.getAuthor().startsWith(String.valueOf(author));
        }).filter(book ->{
            return book.getTitle().startsWith(String.valueOf(title));
        }).forEach(System.out::println);
    }

    private static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Robbie Campbell","Deadly Gas"));
        books.add(new Book("Robbie Campbell","The Cool Winter"));
        books.add(new Book("Tony Branchman","The Warm Winter"));
        books.add(new Book("Sergio Leon","The Hot Spring"));
        books.add(new Book("Chris Afgan","Die Twice or Live"));
        books.add(new Book("Howard Grebbs","The Vile Roach"));
        books.add(new Book("Howard Grebbs","Sad winter"));
        books.add(new Book("Chris Afgan","Warzone"));
        books.add(new Book("Robbie Campbell","Deadly Gas"));
        books.add(new Book("Robbie Campbell","The Cool Winter"));
        books.add(new Book("Tony Branchman","The Warm Winter"));
        books.add(new Book("Sergio Leon","The Hot Spring"));
        books.add(new Book("Chris Afgan","Die Twice or Live"));
        books.add(new Book("Howard Grebbs","The Vile Roach"));
        books.add(new Book("Howard Grebbs","Sad winter"));
        books.add(new Book("Chris Afgan","Warzone"));
        return books;
    }
}
