package br.com.luizlcezario.me.forumalura.controller;

import br.com.luizlcezario.me.forumalura.controller.dto.EditTopicsCreateDto;
import br.com.luizlcezario.me.forumalura.controller.dto.TopicsCreateDto;
import br.com.luizlcezario.me.forumalura.model.Topics;
import br.com.luizlcezario.me.forumalura.services.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/topics")
public class TopicsController {

    @Autowired
    private final TopicsService topicsService;

    public TopicsController(TopicsService topicsService) {
        this.topicsService = topicsService;
    }

    @GetMapping(value = "/{id}")
    private ResponseEntity<Topics> findById(@PathVariable UUID id) {
        Topics topics = topicsService.findById(id);
        return ResponseEntity.ok(topics);
    }

    @GetMapping(value =  "/")
    private ResponseEntity<List<Topics>> findAll() {
        List<Topics> topics = topicsService.findAll();
        return ResponseEntity.ok(topics);
    }

    @PostMapping(value = "/create")
    private ResponseEntity<Topics>  create(@RequestBody TopicsCreateDto body) {
        Topics topic = topicsService.create(body);
        return ResponseEntity.status(204).body(topic);
    }

    @PutMapping(value = "/edit/{id}")
    private ResponseEntity<Topics> editById(@PathVariable UUID id, @RequestBody EditTopicsCreateDto edit) {
        Topics topics = topicsService.editTopics(id, edit);
        return ResponseEntity.ok(topics);
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<?>  deletById(@PathVariable UUID id) {
        topicsService.deleteById(id);
        return (ResponseEntity<?>) ResponseEntity.ok();
    }

}
