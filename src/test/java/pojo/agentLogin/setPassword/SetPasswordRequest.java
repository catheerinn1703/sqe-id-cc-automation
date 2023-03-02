package pojo.agentLogin.setPassword;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SetPasswordRequest {

    private String username;
    private String password;

    public static SetPasswordRequest setPasswordRequest(String username, String password) {
        return SetPasswordRequest.builder().username(username)
                .password(password)
                .build();
    }

}
