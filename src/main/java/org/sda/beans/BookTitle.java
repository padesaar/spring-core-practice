package org.sda.beans;
import org.sda.interfaces.BookName;
import org.springframework.stereotype.Component;

@Component(value = "bookName")
public class BookTitle implements BookName {

    private String name;

    public BookTitle() {
        this.name = "The Hobbit";

}
    @Override
    public String getTitle() {
        return this.name;
    }
}
