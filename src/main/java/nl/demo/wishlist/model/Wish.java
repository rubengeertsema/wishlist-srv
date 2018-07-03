package nl.demo.wishlist.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by rubengeertsema on 16/04/2017.
 */
@Entity
@Table(name = "WISHES")
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"date"})
public class Wish {

    @Id
    @Column(name = "WISH_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter private Long id;

    @Column(name = "WISH_TITLE")
    @Getter @Setter private String title;

    @Column(name = "WISH_DESCRIPTION")
    @Getter @Setter private String description;

    @Column(name = "WISH_DATE", columnDefinition = "TIMESTAMP")
    @Getter @Setter private Date date;
}
