package com.example.url_shortener.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "urls",
        indexes = {
                @Index(name = "urls_short_url_idx", columnList = "short_url")
        }
)
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Url {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "short_url")
    private String shortUrl;
    @Column(name = "long_url")
    private String longUrl;
}
