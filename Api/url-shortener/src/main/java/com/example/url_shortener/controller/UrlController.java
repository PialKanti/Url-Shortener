package com.example.url_shortener.controller;

import com.example.url_shortener.model.dto.request.UrlCreateRequest;
import com.example.url_shortener.model.entity.Url;
import com.example.url_shortener.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/urls")
@RequiredArgsConstructor
public class UrlController {
    private final UrlService urlService;

    @PostMapping
    public ResponseEntity<Url> create(@RequestBody UrlCreateRequest createRequest){
        return ResponseEntity.ok(urlService.create(createRequest));
    }

    @GetMapping("/{shortUrl}")
    public ResponseEntity<Url> getByShortUrl(@PathVariable String shortUrl){
        return ResponseEntity.ok(urlService.getByShortUrl(shortUrl));
    }
}
