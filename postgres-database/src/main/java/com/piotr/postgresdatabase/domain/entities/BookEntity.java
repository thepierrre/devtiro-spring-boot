package com.piotr.postgresdatabase.domain.entities;

import com.piotr.postgresdatabase.domain.entities.AuthorEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    private String isbn;
    private String title;
    @ManyToOne(cascade = CascadeType.ALL) // every change you make to the author via the book will be saved in the DB
    @JoinColumn(name = "author_id") // what the Author looks like in the book table in the DB
    private AuthorEntity authorEntity;
//  instead of: private Long authorId;


}
