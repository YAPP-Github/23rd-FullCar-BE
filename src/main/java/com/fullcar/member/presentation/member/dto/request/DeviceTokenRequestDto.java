package com.fullcar.member.presentation.member.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DeviceTokenRequestDto {
    @Schema(description = "디바이스 토큰", example = "123")
    private String deviceToken;
}
