package service.reader;

import data.models.MembershipStatus;
import data.models.Reader;
import data.repositories.ReaderRepository;
import dto.request.reader.LoginRequest;
import dto.request.reader.RegisterRequest;
import dto.response.reader.LoginResponse;
import dto.response.reader.RegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;

import static data.models.MembershipStatus.ACTIVE;
//@Autowired

public class ReaderServiceImpl implements ReaderService {
    private ReaderRepository storeReaderInformation;
    @Override
    public RegisterResponse register(RegisterRequest request) {
        Reader newReader = new Reader();
        newReader.setFullName(request.getFullName());
        newReader.setEmail(request.getEmail());
        newReader.setPassword(request.getPassword());
        newReader.setContactNumber(request.getContactNumber());
        newReader.setMembershipStatus(ACTIVE);
        return null;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        return null;
    }
}






