package edu.farmingdale.csc311.clubdirectory.club;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {

    private final ClubRepository clubRepository;

    public ClubController(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @GetMapping
    public Iterable<Club> getAllClubs(@RequestParam(required = false) String category) {
        if (category != null && !category.isEmpty()) {
            return clubRepository.findByCategoryIgnoreCase(category);
        } else {
            return clubRepository.findAll();
        }
    }

    @GetMapping("/{id}")
    public Club getClubById(@PathVariable Long id) {
        return clubRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No club with id " + id));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Club createClub(@RequestBody Club club) {
        Club newClub = new Club(
                club.getName(),
                club.getCategory(),
                club.getMeetingDay(),
                club.getRoom()
        );
        return clubRepository.save(newClub);
    }

}
