package dto.request;

import data.models.MembershipStatus;
import lombok.Data;

@Data
public class RegistrationRequest {
    private String fullName;
    private String email;
    private String password;
    private String contactNumber;
}
