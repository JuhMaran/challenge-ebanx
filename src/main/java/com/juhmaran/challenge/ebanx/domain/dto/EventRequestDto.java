package com.juhmaran.challenge.ebanx.domain.dto;

import lombok.Builder;

import java.math.BigDecimal;

/**
 * ebanx
 *
 * @author Juliane Maran
 * @since 07/05/2026
 */
@Builder
public record EventRequestDto(
  String type,
  String origin,
  String destination,
  BigDecimal amount
) {
}
