package br.com.luizlcezario.me.forumalura.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_topics")
public class Topics {

    @Id
    @GeneratedValue(generator = "uuid-hibernate-generator")
    @GenericGenerator(name = "uuid-hibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(unique = true)
    private String title;

    private String message;


    @CreationTimestamp
    private Instant created_at;

    private Boolean Enabled;

    private String author;

    private String course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Topics)) return false;
        Topics topics = (Topics) o;
        return Objects.equals(id, topics.id) && Objects.equals(title, topics.title) && Objects.equals(message, topics.message) && Objects.equals(created_at, topics.created_at) && Objects.equals(Enabled, topics.Enabled) && Objects.equals(author, topics.author) && Objects.equals(course, topics.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, message, created_at, Enabled, author, course);
    }

    public Topics() {
    }

    public Topics(UUID id, String title, String message, Instant created_at, Boolean enabled, String author, String course) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.created_at = created_at;
        Enabled = enabled;
        this.author = author;
        this.course = course;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Instant getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Instant created_at) {
        this.created_at = created_at;
    }

    public Boolean getEnabled() {
        return Enabled;
    }

    public void setEnabled(Boolean enabled) {
        Enabled = enabled;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}

