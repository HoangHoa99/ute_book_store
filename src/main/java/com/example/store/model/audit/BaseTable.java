package com.example.store.model.audit;

import java.time.LocalDate;

public interface BaseTable {

    public LocalDate getCreateAt();

    public BaseTable setCreateAt(LocalDate value);

    public LocalDate getUpdateAt();

    public BaseTable setUpdateAt(LocalDate value);

    public String getDelFlg();

    public BaseTable setDelFlg(String value);
}
