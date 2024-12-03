package com.rocketseat.redirectUrlShortener;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter

public class UrlData {
    private String originalUrl;
    public long expirationTime;

    public long getExpirationTime() {
        return expirationTime;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }
}
