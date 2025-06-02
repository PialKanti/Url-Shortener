package com.example.url_shortener.service;

import com.example.url_shortener.model.dto.request.UrlCreateRequest;
import com.example.url_shortener.model.entity.Url;

import java.util.concurrent.CompletableFuture;

public interface UrlService {
    CompletableFuture<Url> create(UrlCreateRequest urlCreateRequest);
    Url getByShortUrl(String shortUrl);
}
