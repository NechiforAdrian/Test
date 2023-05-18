package itschool19cleancode.singleresponsability;

public class SingleResponsabilityClass {

    private UserAuthenticationService authenticationService;
    private EmailService emailService;

    public SingleResponsabilityClass(UserAuthenticationService authenticationService, EmailService emailService) {
        this.authenticationService = authenticationService;
        this.emailService = emailService;
    }
    void processLogin(String username, String password) {
        if(authenticationService.authenticationUser(username, password)){
            String message = "user authenticated!";
            emailService.sendNotificationEmail(username, message);
        }else{
            String message = "Authentication failde!";
            emailService.sendNotificationEmail(username, message);
        }
    }
}

class UserAuthenticationService {

    boolean authenticationUser(String username, String password){
        //logic goes here
        return false;
    }
}

class EmailService {

    void sendNotificationEmail (String recipient, String message) {
        //logic goes here

    }
}