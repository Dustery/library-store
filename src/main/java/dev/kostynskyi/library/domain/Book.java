package dev.kostynskyi.library.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {

    @Id
    @SequenceGenerator(name = "jpaSequenceBook", sequenceName = "JPA_SEQUENCE_BOOK", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jpaSequenceBook")
    private long id;

    private String title;
    private String author;
    private int year;
    private float price;
}