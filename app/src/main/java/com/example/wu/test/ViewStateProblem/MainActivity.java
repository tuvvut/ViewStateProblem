package com.example.wu.test.ViewStateProblem;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    UserDataEditText user1;
    UserDataEditText user2;
    UserDataEditText user3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user1 = (UserDataEditText) findViewById(R.id.user1);
        user2 = (UserDataEditText) findViewById(R.id.user2);
        user3 = (UserDataEditText) findViewById(R.id.user3);

        setData(user1, "user 1", "address 1", "0911111111");
        setData(user2, "user 2", "address 2", "0922222222");
        setData(user3, "user 3", "address 3", "0933333333");
    }

    private void setData(UserDataEditText v, String userName, String address, String phone) {
        v.setUserName(userName);
        v.setAddress(address);
        v.setPhone(phone);
    }
}
