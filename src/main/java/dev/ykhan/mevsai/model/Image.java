package dev.ykhan.mevsai.model;

import jakarta.persistence.*;

/**
 * Represents an image, that is either
 * AI generated (by DALL-E) or non-AI generated (Google).
 * Stored in an S3 bucket with bucketPath to simplify things.
 */
@Entity
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "challenge", nullable = false)
    private Challenge challenge;

    @Column(name = "bucket_path", nullable = false)
    private String bucketPath;

    @Column(name = "is_correct", nullable = false)
    private boolean isCorrect;

    public Image(Challenge challenge, String bucketPath, boolean isCorrect) {
        this.challenge = challenge;
        this.bucketPath = bucketPath;
        this.isCorrect = isCorrect;
    }

    public Image() {}
}
