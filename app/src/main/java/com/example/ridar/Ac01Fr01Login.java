package com.example.ridar;

/*
fragment 01.01:
        Login
        TextView ["Log-in"]
        EditText [IdentifierEditText, PasswordEditText]
        Button [LoginButton (to MainActivity), RegisterButton (to Ac01Fr02Register), ForgotPasswordButton (to Ac01Fr03ForgotPassword)]
*/

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Ac01Fr01Login#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Ac01Fr01Login extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Ac01Fr01Login() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Ac01Fr01Login.
     */
    // TODO: Rename and change types and number of parameters
    public static Ac01Fr01Login newInstance(String param1, String param2) {
        Ac01Fr01Login fragment = new Ac01Fr01Login();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac01_fr01_login, container, false);
    }
}