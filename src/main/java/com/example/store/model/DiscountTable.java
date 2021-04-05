package com.example.store.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.store.constant.FlagConst;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_discounts")
public class DiscountTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long value;

    @Column(name = "create_at")
    private LocalDate createAt = LocalDate.now();

    @Column(name = "update_at")
    private LocalDate updateAt = LocalDate.now();

    @Column(name = "del_flg")
    private String delFlg = FlagConst.FALSE;
}
