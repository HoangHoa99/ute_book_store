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
@Table(name = "tb_authorities")
public class AuthorityTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "authority_name")
    private String authorityName;

    @Column(name = "create_at")
    private LocalDate createAt = LocalDate.now();

    @Column(name = "update_at")
    private LocalDate updateAt = LocalDate.now();

    @Column(name = "del_flg")
    private String delFlg = FlagConst.FALSE;
}
