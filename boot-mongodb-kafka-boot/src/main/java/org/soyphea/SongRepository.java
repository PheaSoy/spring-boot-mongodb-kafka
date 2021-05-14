package org.soyphea;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SongRepository extends ReactiveCrudRepository<Song,String> {
}
