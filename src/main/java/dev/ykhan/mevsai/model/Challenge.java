package dev.ykhan.mevsai.model;

import jakarta.persistence.*;

import java.util.List;

/**
 * Represents a 'challenge', or a simple representation
 * of two choices (an AI image and a non-AI image) and the correct choice (non-AI image).
 * We hold images in a List so we can scramble the order on creation, and also
 * provide support for > 2 choices in the future for fun :)
 */
@Entity
@Table(name = "challenges")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Category category;

    @OneToMany(mappedBy = "challenge")
    private List<Image> choices;

    public Challenge(Category category, List<Image> choices) {
        this.category = category;
        this.choices = choices;
    }

    public Challenge() {}
}
