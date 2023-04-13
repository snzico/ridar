package com.example.ridar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
fragment 02.01:
Home
    ? Menu [AppBar, NavigationDrawer] ? - Consider
    ^ https://stackoverflow.com/questions/5126972/nested-activities-android ^
    *AppBar [TopAppBar]
    ^ https://m2.material.io/components/app-bars-top/android ^
    ^ https://developer.android.com/guide/navigation/navigation-ui?gclid=CjwKCAjwitShBhA6EiwAq3RqA7B61U6Mae4Nodm4OnDOpJbBnRtzpqYGgx5XHM780LxJtwxJkT3YZBoCRmAQAvD_BwE&gclsrc=aw.ds ^
    *NavigationDrawer [MainNavigationDrawer]
    ^ https://m2.material.io/components/navigation-drawer ^
    ^ https://itnext.io/app-bar-and-navigation-drawer-in-jetpack-compose-dc799417e459 ^
    Fragment [Ac02Fr02Search, Ac02Fr03CreateSubmission, Ac02Fr04SubmissionHistory]
    *Consider making nested activity or additional fragment*
*/

public class Ac02Fr01Home extends Fragment {
    /*
    default params passed to fragment
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;
    */

    public Ac02Fr01Home() {
        // Required empty public constructor
    }

    public static Ac02Fr01Home newInstance(String param1, String param2) {
        Ac02Fr01Home fragment = new Ac02Fr01Home();
        /*
        args from parameters passed in class definition
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        */
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            /*
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
            */
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ac02_fr01_home, container, false);
    }
}