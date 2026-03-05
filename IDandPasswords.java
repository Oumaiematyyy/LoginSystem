import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){
        logininfo.put("Oum", "Heidi@");
        logininfo.put("Oummy", "couscous123");
        logininfo.put("Ivy", "PASSWORD");

    }
    protected HashMap getLoginInfo(){
        return logininfo;

    }
}
