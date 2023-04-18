package com.ani.transform.domain;

import com.ani.transform.xml.LocalDateAdapter;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;



@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@XmlRootElement(name = "book")
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    private String title;
    private String isbn;

    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate publishedDate;
    private String genre;

    @XmlElement(name = "author")
    private Author author;

    @XmlElement(name = "publisher")
    private Publisher publisher;
}


