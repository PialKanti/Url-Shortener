package com.example.url_shortener.service.impl;

import com.example.url_shortener.UrlRepository;
import com.example.url_shortener.model.dto.request.UrlCreateRequest;
import com.example.url_shortener.model.entity.Url;
import com.example.url_shortener.service.UrlService;
import com.example.url_shortener.util.DateUtil;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.url_shortener.util.Base62Encoder.encode;

@Service
@RequiredArgsConstructor
public class UrlServiceImpl implements UrlService {
    private final UrlRepository urlRepository;

    @Override
    public Url create(UrlCreateRequest urlCreateRequest) {
        Url urlToBeShortened = Url.builder()
                .longUrl(urlCreateRequest.longUrl())
                .shortUrl(encode(DateUtil.getCurrentTimestamp()))
                .build();

        return urlRepository.save(urlToBeShortened);
    }

    @Override
    public Url getByShortUrl(String shortUrl) {
        return urlRepository.findByShortUrl(shortUrl).orElseThrow(() -> new EntityNotFoundException("Url not found"));
    }
}
