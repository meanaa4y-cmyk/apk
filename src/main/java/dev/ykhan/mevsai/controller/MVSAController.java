package dev.ykhan.mevsai.controller;

import dev.ykhan.mevsai.model.Category;
import dev.ykhan.mevsai.model.Challenge;
import dev.ykhan.mevsai.util.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The main controller of the web application.
 */
@RestController
@RequestMapping("/api")
public class MVSAController {

    /**
     * The category of the day.
     * @return a ResponseEntity containing a Category and an HttpStatus.
     */
    @RequestMapping("/categories")
    public ResponseEntity<List<Category>> category() {

        return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * The challenges for the day.
     * @return a ResponseEntity containing a Category, a List of Challenges, and an HttpStatus.
     */
    @RequestMapping("/today")
    public ResponseEntity<Pair<Category, List<Challenge>>> today() {
        return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * A guess for a certain challenge, returning
     * true or false on whether they got the correct guess
     * or not.
     *
     * @return a ResponseEntity containing a Boolean
     */
    @RequestMapping("/guess/{id}")
    public ResponseEntity<Boolean> guess(@PathVariable Long id, @RequestParam(required = true) Integer choice) {
        return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);
    }
}
