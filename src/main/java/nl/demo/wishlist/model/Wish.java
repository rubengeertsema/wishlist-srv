package nl.demo.wishlist.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.ZonedDateTime;

@Data
@Entity
@Table(name = "WISHES", schema = "wishes")
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"dateTime"})
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // https://hibernate.atlassian.net/browse/OGM-641?attachmentOrder=desc
public class Wish implements Serializable {

    @Id
    @Column(name = "WISH_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "WISH_TITLE")
    private String title;

    @Column(name = "WISH_DESCRIPTION")
    private String description;

    @Column(name = "WISH_DATE", columnDefinition = "DATETIME")
    private ZonedDateTime dateTime;
}
