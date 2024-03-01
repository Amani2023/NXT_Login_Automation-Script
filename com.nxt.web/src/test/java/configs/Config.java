package configs;

public class Config {
    private String BASE_URL="https://qa-test-frontend-ce07bae316f3.herokuapp.com/";

    public String getBASE_URL(){
        return BASE_URL;
    }
    public void setBASE_URL(String base_url){
        BASE_URL=base_url;

    }
}
