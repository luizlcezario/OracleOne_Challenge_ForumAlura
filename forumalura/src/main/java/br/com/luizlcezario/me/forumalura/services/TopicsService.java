package br.com.luizlcezario.me.forumalura.services;

import br.com.luizlcezario.me.forumalura.controller.dto.EditTopicsCreateDto;
import br.com.luizlcezario.me.forumalura.controller.dto.TopicsCreateDto;
import br.com.luizlcezario.me.forumalura.model.Topics;
import br.com.luizlcezario.me.forumalura.repositories.TopicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.UUID;

@Service
public class TopicsService {

    @Autowired
    private final TopicsRepository topicsRepository;

    public TopicsService(TopicsRepository topicsRepository) {
        this.topicsRepository = topicsRepository;
    }

    public Topics findById(UUID id) {
        return topicsRepository.findById(id).orElseThrow();
    }

    public List<Topics> findAll() {
        return topicsRepository.findAll();
    }

    public void deleteById(UUID id) {
        topicsRepository.deleteById(id);
    }

    public Topics create(TopicsCreateDto body) {
        if (topicsRepository.findByTitle(body.getTitle()).isPresent()) {
            throw new RuntimeException();
        }
        return topicsRepository.save(new Topics(null, body.getTitle(), body.getMessage(), null, true, body.getAuthor(), body.getCourse()));
    }

    public Topics editTopics(UUID id, EditTopicsCreateDto edit) {
        Topics topics = topicsRepository.findById(id).orElseThrow();
        if (edit.getAuthor() != null)  topics.setAuthor(edit.getAuthor());
        if (edit.getEnabled() != null) topics.setEnabled(edit.getEnabled());
        if (edit.getCourse() != null) topics.setCourse(edit.getCourse());
        if (edit.getTitle() != null) topics.setTitle(edit.getTitle());
        if (edit.getMessage() != null) topics.setMessage(edit.getMessage());
        topics = topicsRepository.save(topics);
        return topics;
    }
}
