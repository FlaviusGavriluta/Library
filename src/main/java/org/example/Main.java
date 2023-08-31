package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Power of now", "Eckhart Tole", 50));
        books.add(new Book("Who broke the chain...", "Neil Anderson", 65));

        Discount discount = new Discount("Summar sale", 20);

        books.stream().forEach(book -> {
            double newPrice = book.price() - (book.price() * discount.percentage() / 100);
            System.out.println("The Summer price for " + book.title() + " by " + book.author() + " is " + newPrice);
        });
    }
}