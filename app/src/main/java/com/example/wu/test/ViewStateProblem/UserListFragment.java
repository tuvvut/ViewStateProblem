package com.example.wu.test.ViewStateProblem;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by wu on 2016/01/05
 */
public class UserListFragment extends Fragment {
    UserDataEditText user1;
    UserDataEditText user2;
    UserDataEditText user3;
    Button next;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.userlist, container, false);
        next = (Button) v.findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.replace(R.id.container, new OtherFragment(), "other");
                ft.addToBackStack(null);
                ft.commit();
            }
        });

        user1 = (UserDataEditText) v.findViewById(R.id.user1);
        user2 = (UserDataEditText) v.findViewById(R.id.user2);
        user3 = (UserDataEditText) v.findViewById(R.id.user3);

        setData(user1, "user 1", "address 1", "0911111111");
        setData(user2, "user 2", "address 2", "0922222222");
        setData(user3, "user 3", "address 3", "0933333333");
        return v;

    }

    private void setData(UserDataEditText v, String userName, String address, String phone) {
        v.setUserName(userName);
        v.setAddress(address);
        v.setPhone(phone);
    }
}
