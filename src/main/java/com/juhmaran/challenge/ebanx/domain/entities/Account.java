package com.juhmaran.challenge.ebanx.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * ebanx
 *
 * @author Juliane Maran
 * @since 07/05/2026
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Account {

  private String id;
  private BigDecimal balance;

}
