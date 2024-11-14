package Nov.ex_14112024_Static_Wrapper;

public enum APIConstants {

    Base_Url("https://app.vwo.com"),
    Login_Page("https://app.vwo.com/login"),
    Dashboard_Page("https://app.vwo.com/dashboard"),
    Chatbot_Page("https://app.vwo.com/chat");

    private  String name;

    APIConstants(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
