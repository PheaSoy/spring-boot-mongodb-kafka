package org.soyphea;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Song {
   @Id
   String id;
   private String name;
   private LocalDate publishDate;
   private String singer;
}
