package br.com.luizlcezario.me.forumalura.controller.dto;

import java.util.Date;
import java.util.Objects;

public class TopicsCreateDto {

    private String title;

    private String message;

    private String author;

    private String course;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TopicsCreateDto)) return false;
        TopicsCreateDto that = (TopicsCreateDto) o;
        return Objects.equals(title, that.title) && Objects.equals(message, that.message) && Objects.equals(author, that.author) && Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, message, author, course);
    }

    public TopicsCreateDto() {
    }

    public TopicsCreateDto(String title, String message, String author, String course) {
        this.title = title;
        this.message = message;
        this.author = author;
        this.course = course;
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
