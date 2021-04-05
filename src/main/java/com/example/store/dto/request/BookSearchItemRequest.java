package com.example.store.dto.request;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookSearchItemRequest extends BaseRequest {
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 1L;

    @NotNull
    private Long id;

}
