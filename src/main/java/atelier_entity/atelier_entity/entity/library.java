package atelier_entity.atelier_entity.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class library {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name", length = 50, nullable = false)
        private String name;

        @Column(name = "address", length = 255, nullable = false)
        private String address;

        public library(){

        }
        @OneToMany(mappedBy = "library")
        private List<books> books = new ArrayList<>();

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    public List<atelier_entity.atelier_entity.entity.books> getBooks() {
        return books;
    }

    public void setBooks(List<atelier_entity.atelier_entity.entity.books> books) {
        this.books = books;
    }
}
