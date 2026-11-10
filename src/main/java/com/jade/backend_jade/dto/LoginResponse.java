package com.jade.backend_jade.dto;

public record LoginResponse(String accessToken, Long expiresIn) {
}