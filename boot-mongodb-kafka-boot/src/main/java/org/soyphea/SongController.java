package org.soyphea;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class SongController {

    private SongRepository songRepository;

    public SongController(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @GetMapping("/songs")
    Flux<Song> getAllSong() {
        return songRepository.findAll();
    }

    @PostMapping("/songs")
    Mono<Song> addSong(@RequestBody Song song) {
        return songRepository.save(song);
    }

    @GetMapping("/songs/{id}")
    Mono<Song> findSong(@PathVariable("id") String id) {
        return songRepository.findById(id);
    }
}
