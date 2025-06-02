package com.example.url_shortener.service;

import com.example.url_shortener.model.dto.request.UrlCreateRequest;
import com.example.url_shortener.model.entity.Url;

import java.util.concurrent.ExecutionException;

public interface UrlService {
    Url create(UrlCreateRequest urlCreateRequest) throws ExecutionException, InterruptedException;
    Url getByShortUrl(String shortUrl);
}
