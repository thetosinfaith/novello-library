package service;

import dto.request.reader.LoginReaderRequest;
import dto.request.reader.RegisterReaderRequest;
import dto.response.reader.ReaderLoginResponse;
import dto.response.reader.RegisterReaderResponse;

public interface ReaderService {
    RegisterReaderResponse register (RegisterReaderRequest request);
    ReaderLoginResponse login (LoginReaderRequest request);
}
