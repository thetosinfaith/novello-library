package service.reader;

import data.models.ReaderModel;
import data.repositories.ReaderRepository;
import dto.request.reader.LoginRequest;
import dto.request.reader.RegisterRequest;
import dto.response.reader.LoginResponse;
import dto.response.reader.RegisterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static data.models.MembershipStatus.ACTIVE;
@Service
public class ReaderServiceImpl implements ReaderService {
    @Autowired
    private ReaderRepository storeReaderInformation; //Dependency injection
   //override enables me to implement the methods in the interface
    @Override
    public RegisterResponse register(RegisterRequest request) {
        //Datatype variableName = create new data model
        ReaderModel newReader = new ReaderModel();
        //set the fields of the new user model with details from the request dto
        newReader.setFullName(request.getFullName());
        newReader.setEmail(request.getEmail());
        newReader.setPassword(request.getPassword());
        newReader.setContactNumber(request.getContactNumber());
        newReader.setMembershipStatus(ACTIVE);

        //saving to the reader model to the database
        ReaderModel savedUser = storeReaderInformation.save(newReader);

        //create a response set it and return response.
        RegisterResponse response = new RegisterResponse();
        response.setMessage("Registration successful!");
        return response;
    }

    @Override
    public LoginResponse login(LoginRequest request) {
        //using the repo to check the database to confirm that the email from the dto is correct
       Optional<ReaderModel> foundUser = storeReaderInformation.findByEmail(request.getEmail());

       //This is to check if the user is present
       if (foundUser.isEmpty()){
           throw new RuntimeException("User does not exist!");
       }
       //.get means probability May or may not - get password and compare with what is given to me at the frontend
        if (!foundUser.get().getPassword().equals(request.getPassword())){
           throw new RuntimeException("Password Not Correct!");
       }
       LoginResponse response = new LoginResponse();
       response.setMessage("Logged in successfully!");
        return response;
    }
}






