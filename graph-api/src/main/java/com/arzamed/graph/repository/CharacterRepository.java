package com.arzamed.graph.repository;

import com.arangodb.springframework.repository.ArangoRepository;
import com.arzamed.graph.model.Character;

//@Repository
public interface CharacterRepository extends ArangoRepository<Character, String> {
}
