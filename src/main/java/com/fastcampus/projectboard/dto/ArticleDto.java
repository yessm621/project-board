package com.fastcampus.projectboard.dto;

import java.time.LocalDateTime;

public record ArticleDto(
        String title,
        String content,
        String hashtag,
        LocalDateTime createdDate,
        String createdBy) {
    public static ArticleDto of(String title, String content, String hashtag, LocalDateTime createdDate, String createdBy) {
        return new ArticleDto(title, content, hashtag, createdDate, createdBy);
    }
}
