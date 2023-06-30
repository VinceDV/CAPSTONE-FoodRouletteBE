package com.FoodRouletteBE.security.service;

import com.FoodRouletteBE.security.payload.LoginDto;
import com.FoodRouletteBE.security.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
