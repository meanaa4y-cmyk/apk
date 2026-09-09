package dev.ykhan.mevsai.model;

import jakarta.persistence.*;

import java.util.List;

/**
 * Represents a category (once per day) that is about objects (fruit, cars, etc.)
 * and animals (whales, cats, dogs). People are not included, as
 * OpenAI's Dall-E intentionally ignores it and struggles to
 * produce realistic results of humans ;).
 */
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Challenge> challenges;

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, List<Challenge> challenges) {
        this(name);
        this.challenges = challenges;
    }

    public Category() {}
}
