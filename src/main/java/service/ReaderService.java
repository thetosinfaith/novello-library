package service;

import dto.request.LoginRequest;
import dto.request.RegistrationRequest;
import dto.response.LoginResponse;
import dto.response.RegistrationResponse;

public interface ReaderService {
   RegistrationResponse register (RegistrationRequest request);
    LoginResponse login (LoginRequest request);
}
