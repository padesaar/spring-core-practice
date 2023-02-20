package org.sda.beans;

import lombok.Setter;
import org.sda.interfaces.BeanName;
import org.sda.interfaces.BookName;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Setter
@Component
public class MyBook {
    private BookName name;
    public MyBook(@Qualifier("bookName") BookName name){
        this.name = name;
    }

    public String bookTitle() {
        return "Title of the book is: " + name.getTitle();
    }
}
