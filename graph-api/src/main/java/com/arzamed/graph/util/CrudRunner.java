package com.arzamed.graph.util;

import com.arangodb.springframework.core.ArangoOperations;
import com.arzamed.graph.model.Character;
import com.arzamed.graph.repository.CharacterRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Log4j2
@Component
public class CrudRunner implements CommandLineRunner {
    private final ArangoOperations arangoOperations;
    private final CharacterRepository characterRepository;

    public CrudRunner(ArangoOperations arangoOperations, CharacterRepository characterRepository) {
        this.arangoOperations = arangoOperations;
        this.characterRepository = characterRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(" In C r u d Runner");
        // first drop the database so that we can run this multiple time, idempotent
        arangoOperations.dropDatabase();

        // save the single entry in the database
        // there is no need of creating the collection first. Happens automatically.
        Character nedStark = new Character("Ned", "Stark", true, 41);
        characterRepository.save(nedStark);
        log.info("Ned Stark saved with id {}", nedStark.getId());

        //now find the character just saved.
        Optional<Character> foundById = characterRepository.findById(nedStark.getId());
        if (foundById.isPresent()) {
            log.info("Ned Stark searched with id {}", foundById.get().toString());
        } else {
            log.info("S E A R C H failed.");
        }
    }
}
