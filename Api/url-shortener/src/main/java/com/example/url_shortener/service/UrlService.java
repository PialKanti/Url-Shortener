package com.example.url_shortener.service;

import com.example.url_shortener.model.dto.request.UrlCreateRequest;
import com.example.url_shortener.model.entity.Url;

public interface UrlService {
    Url create(UrlCreateRequest urlCreateRequest);
    Url getByShortUrl(String shortUrl);
}
