package net.alterapp.miniproject3.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "book")
@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(
        name = "seq",
        sequenceName = "s_book",
        initialValue = 1,
        allocationSize = 1
)
public class Book extends AuditModel{
    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "ganre")
    private String ganre;

    @Column(name = "pagesAmount")
    private int pagesAmount = 0;

    @Column(name = "availableBooks")
    private  Integer availableBook=1;

    @ManyToOne
    private Library library;
}
