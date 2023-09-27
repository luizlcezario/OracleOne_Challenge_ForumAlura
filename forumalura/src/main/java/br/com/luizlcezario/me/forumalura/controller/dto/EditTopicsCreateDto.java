package br.com.luizlcezario.me.forumalura.controller.dto;

import java.util.Objects;
import java.util.Optional;

public class EditTopicsCreateDto {
    private Optional<String> title;

    private Optional<String> message;

    private Optional<String> author;

    private Optional<String> course;

    private Optional<Boolean> enabled;

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

    public EditTopicsCreateDto(Optional<String> title, Optional<String> message, Optional<String> author, Optional<String> course, Optional<Boolean> enabled) {
        this.title = title;
        this.message = message;
        this.author = author;
        this.course = course;
        this.enabled = enabled;
    }

    public Optional<String> getTitle() {
        return title;
    }

    public void setTitle(Optional<String> title) {
        this.title = title;
    }

    public Optional<String> getMessage() {
        return message;
    }

    public void setMessage(Optional<String> message) {
        this.message = message;
    }

    public Optional<String> getAuthor() {
        return author;
    }

    public void setAuthor(Optional<String> author) {
        this.author = author;
    }

    public Optional<String> getCourse() {
        return course;
    }

    public void setCourse(Optional<String> course) {
        this.course = course;
    }

    public Optional<Boolean> getEnabled() {
        return enabled;
    }

    public void setEnabled(Optional<Boolean> enabled) {
        this.enabled = enabled;
    }

    public EditTopicsCreateDto() {
    }
}
