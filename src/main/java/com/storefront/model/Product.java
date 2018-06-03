package com.storefront.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "products")
public class Product {

    @NonNull
    private String guid;

    @NonNull
    private String title;
}
