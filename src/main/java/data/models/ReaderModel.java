package data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class ReaderModel {
    @Id
    private String id;
    private String fullName;
    private String email;
    private String password;
    private String contactNumber;
    private MembershipStatus membershipStatus;
}
