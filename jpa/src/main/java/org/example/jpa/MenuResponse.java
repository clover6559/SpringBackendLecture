package org.example.jpa;

public record MenuResponse(
    Long id,
    String name,
    int price,
    String categoryName
) {}