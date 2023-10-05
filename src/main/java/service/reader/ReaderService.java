package service.reader;

import dto.request.reader.LoginRequest;
import dto.request.reader.RegisterRequest;
import dto.response.reader.LoginResponse;
import dto.response.reader.RegisterResponse;

public interface ReaderService {
    RegisterResponse register (RegisterRequest request);
    LoginResponse login (LoginRequest request);
}
