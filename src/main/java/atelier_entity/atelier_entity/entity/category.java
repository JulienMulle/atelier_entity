package atelier_entity.atelier_entity.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 50, nullable = false)
    private String name;

    public category(){

    }

    @ManyToMany(mappedBy = "categories")
    private List<books> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<atelier_entity.atelier_entity.entity.books> getBooks() {
        return books;
    }

    public void setBooks(List<atelier_entity.atelier_entity.entity.books> books) {
        this.books = books;
    }
}
