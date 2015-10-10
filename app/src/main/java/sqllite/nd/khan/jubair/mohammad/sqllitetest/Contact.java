package sqllite.nd.khan.jubair.mohammad.sqllitetest;

/**
 * Created by laptop on 10/10/2015.
 */
public class Contact {
    int mId;
    String mName;
    String mPhoneNumber;
    public Contact(){   }

    public Contact(int id, String name, String _phone_number){
        this.mId = id;
        this.mName = name;
        this.mPhoneNumber = _phone_number;
    }

    public Contact(String name, String _phone_number){
        this.mName = name;
        this.mPhoneNumber = _phone_number;
    }

    public int getID(){
        return this.mId;
    }

    public void setID(int id){
        this.mId = id;
    }

    public String getName(){
        return this.mName;
    }

    public void setName(String name){
        this.mName = name;
    }

    public String getPhoneNumber(){
        return this.mPhoneNumber;
    }

    public void setPhoneNumber(String _phone_number){
        this.mPhoneNumber = _phone_number;
    }
}