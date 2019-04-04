public class LoginInf {

    private String brugernavn;
    private String password;

    public LoginInf(String brugernavn, String password) {
        this.brugernavn = brugernavn;
        this.password = password;
    }

    public String getBrugernavn(){
        return brugernavn;
    }

    public String getPassword() {
        return password;
    }

}
