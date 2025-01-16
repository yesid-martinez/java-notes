package api.http;

import com.google.gson.Gson;

public class GsonTest {
    public static void gsonTest() {
        Gson gson = new Gson();
        Account obj = new Account("Axel", 999999);
        // Object to JSON
        String json = gson.toJson(obj);
        System.out.println("JSON: " + json);

        // JSON to Object
        String jsonString = "{\"name\":\"Peter\",\"balance\":305000}";
        Account accountObj = gson.fromJson(jsonString, Account.class);
        System.out.println("Object: " + accountObj);
        System.out.println("Account owner: " + accountObj.name);
    }
}

class Account {
    public String name;
    public double balance;

    public Account(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

/*    @Override
    public String toString() {
        return "Account owner: " + name + ", balance: " + balance;
    }*/
}
