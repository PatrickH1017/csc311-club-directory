package edu.farmingdale.csc311.clubdirectory.club;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ClubRepository extends CrudRepository<Club, Long> {

    List<Club> findByCategoryIgnoreCase(String category);

}
