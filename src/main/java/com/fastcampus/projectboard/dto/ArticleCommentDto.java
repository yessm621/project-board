package com.fastcampus.projectboard.dto;

import java.time.LocalDateTime;

public record ArticleCommentDto(
        String content,
        LocalDateTime createdDate,
        String createdBy,
        LocalDateTime modifiedDate,
        String modifiedAt
) {
    public static ArticleCommentDto of(String content, LocalDateTime createdDate, String createdBy, LocalDateTime modifiedDate, String modifiedAt) {
        return new ArticleCommentDto(content, createdDate, createdBy, modifiedDate, modifiedAt);
    }
}
