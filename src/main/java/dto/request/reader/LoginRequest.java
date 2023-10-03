package dto.request.reader;

import lombok.Data;

@Data
public class LoginReaderRequest {
    private String email;
    private String password;
}
