import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.print.Book;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Lesson1 {
  public static void main(String[] args) {
    Author myFirstAuthor = new Author("Antoine de Saint-Exupéry","ar.mirzoyan@yahoo.com");
    Book1 myFirsBook = new Book1("number123zs123", "The Little Prince", myFirstAuthor, 9000, 1);


    Author otherAuthor = new Author("Folk","ar.mirzoyan@yahoo.com");
    Book1 otherBook = new Book1("number123zs124", "Davit from Sasun", otherAuthor,10000, 2);

    Author otherAuthor2 = new Author("Jack London","ar.mirzoyan@yahoo.com");
    Book1 otherBook2 = new Book1("number123zs125", "Martin Eden", otherAuthor2,7000);

    System.out.print(myFirsBook.toString() +"\n");
    System.out.print(otherBook.toString() + "\n");
    System.out.print(otherBook2.toString());
  }
}
