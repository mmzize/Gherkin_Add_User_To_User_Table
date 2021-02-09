package Helpers;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;

import java.io.*;

public class Read_Data {

    public static String dir = System.getProperty("user.dir");

    JSONParser parser = new JSONParser();

    Object obj = parser.parse(new FileReader(dir + "\\src\\main\\java\\Test_Data\\Data.json"));

    JSONObject jsonObject = (JSONObject) obj;

    JSONArray Firstname = (JSONArray) jsonObject.get("Firstname");
    JSONArray Lastname = (JSONArray) jsonObject.get("Lastname");
    JSONArray Username = (JSONArray) jsonObject.get("Username");
    JSONArray Password = (JSONArray) jsonObject.get("Password");
    JSONArray Role = (JSONArray) jsonObject.get("Role");
    JSONArray Email = (JSONArray) jsonObject.get("Email");
    JSONArray Cellphone = (JSONArray) jsonObject.get("Cellphone");

    private String _Firstname=Firstname.toJSONString().replace("[","").replace("]","").replace("\"","");
    private String _Lastname=Lastname.toJSONString().replace("[","").replace("]","").replace("\"","");
    private String _Username=Username.toJSONString().replace("[","").replace("]","").replace("\"","");
    private String _Password=Password.toJSONString().replace("[","").replace("]","").replace("\"","");
    private String _Role=Role.toJSONString().replace("[","").replace("]","").replace("\"","");
    private String _Email=Email.toJSONString().replace("[","").replace("]","").replace("\"","");
    private String _Cellphone=Cellphone.toJSONString().replace("[","").replace("]","").replace("\"","");




    public Read_Data() throws IOException, ParseException {
    }

    public String get_Firstname() {
        return _Firstname;
    }

    public void set_Firstname(String _Firstname) {
        this._Firstname = _Firstname;
    }

    public String get_Lastname() {
        return _Lastname;
    }

    public void set_Lastname(String _Lastname) {
        this._Lastname = _Lastname;
    }

    public String get_Username() {
        return _Username;
    }

    public void set_Username(String _Username) {
        this._Username = _Username;
    }

    public String get_Password() {
        return _Password;
    }

    public void set_Password(String _Password) {
        this._Password = _Password;
    }

    public String get_Role() {
        return _Role;
    }

    public void set_Role(String _Role) {
        this._Role = _Role;
    }

    public String get_Email() {
        return _Email;
    }

    public void set_Email(String _Email) {
        this._Email = _Email;
    }

    public String get_Cellphone() {
        return _Cellphone;
    }

    public void set_Cellphone(String _Cellphone) {
        this._Cellphone = _Cellphone;
    }
}
