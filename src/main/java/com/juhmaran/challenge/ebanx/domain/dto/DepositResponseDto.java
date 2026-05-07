package com.juhmaran.challenge.ebanx.domain.dto;

import lombok.Builder;

/**
 * ebanx
 *
 * @author Juliane Maran
 * @since 07/05/2026
 */
@Builder
public record DepositResponseDto(
  AccountResponseDto destination
) {
}
