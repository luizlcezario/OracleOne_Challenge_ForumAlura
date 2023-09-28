package br.com.luizlcezario.me.forumalura.controller.dto;

import java.util.Objects;
public class EditTopicsCreateDto {
    private String title;

    private String message;

    private String author;

    private String course;

    private Boolean enabled;

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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EditTopicsCreateDto)) return false;
        EditTopicsCreateDto that = (EditTopicsCreateDto) o;
        return Objects.equals(title, that.title) && Objects.equals(message, that.message) && Objects.equals(author, that.author) && Objects.equals(course, that.course) && Objects.equals(enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, message, author, course, enabled);
    }

    public EditTopicsCreateDto() {
    }

    public EditTopicsCreateDto(String title, String message, String author, String course, Boolean enabled) {
        this.title = title;
        this.message = message;
        this.author = author;
        this.course = course;
        this.enabled = enabled;
    }
}