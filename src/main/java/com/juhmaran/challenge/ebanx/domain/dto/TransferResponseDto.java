package com.juhmaran.challenge.ebanx.domain.dto;

/**
 * ebanx
 *
 * @author Juliane Maran
 * @since 07/05/2026
 */
public record TransferResponseDto(
  AccountResponseDto origin,
  AccountResponseDto destination
) {
}
