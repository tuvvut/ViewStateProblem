package com.example.wu.test.ViewStateProblem;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.LinearLayout;

public class UserDataEditText extends LinearLayout {
    EditText userName;
    EditText address;
    EditText phone;

    public UserDataEditText(Context context) {
        super(context);
        init();
    }

    public UserDataEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public UserDataEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.userdata_edittext, this);
        userName = (EditText) findViewById(R.id.userName);
        address = (EditText) findViewById(R.id.address);
        phone = (EditText) findViewById(R.id.phone);
    }

    public String getUserName() {
        return userName.getText().toString();
    }

    public void setUserName(String userName) {
        this.userName.setText(userName);
    }

    public String getAddress() {
        return address.getText().toString();
    }

    public void setAddress(String address) {
        this.address.setText(address);
    }

    public String getPhone() {
        return phone.getText().toString();
    }

    public void setPhone(String address) {
        this.phone.setText(address);
    }
}
