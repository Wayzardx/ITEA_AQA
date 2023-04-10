package HomeWork7;

import java.util.ArrayList;
import java.util.HashMap;

public class ListBookMap {

    public static void main(String[] args) {
        ArrayList<String> arrBook = new ArrayList<>();
        arrBook.add("Java A Beginers Guide");
        arrBook.add("Java Basics");
        arrBook.add("SQL Data Structures");
        arrBook.add("Making Java Groovy");
        arrBook.add("ISTQB testing");
        HashMap<Integer, String> bookMap = createBookMap(arrBook);
        System.out.println(bookMap);
    }

    public static HashMap<Integer, String> createBookMap(ArrayList<String> bookList) {
        HashMap<Integer, String> bookMap = new HashMap<>();
        for (int i = 0; i < bookList.size(); i++) {
            bookMap.put(i, bookList.get(i));
        }
        return bookMap;
    }
}

