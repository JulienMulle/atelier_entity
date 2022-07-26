package atelier_entity.atelier_entity.entity;

import javax.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
public class books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title", length = 50, nullable = false)
    private String title;

    @Column(name="author", length = 100, nullable = false)
    private String author;

    @Column(name = "release_Date", nullable = false)
    private Date releaseDate;

    public books(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(
            name = "library_id",
            nullable = true
    )
    private library library;

    @ManyToMany()
    @JoinTable(
            name = "books_category",
            joinColumns = @JoinColumn(name = "books_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private List<category>categories;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public atelier_entity.atelier_entity.entity.library getLibrary() {
        return library;
    }

    public void setLibrary(atelier_entity.atelier_entity.entity.library library) {
        this.library = library;
    }

    public List<category> getCategories() {
        return categories;
    }

    public void setCategories(List<category> categories) {
        this.categories = categories;
    }
}
