package com.example.ridar;

import android.os.Bundle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

// fragment 02.01:
// Home
/*
    Bottom Navigation [toSearch, toSubmit, toHistory]
*/

/* TODO
*   - review and correct naming according to convention
*   - review and correct unhelpful names
*   - update fragment index above
*   - implement bottom navigation
*   - use same content_layout to load fragments
*/

public class Ac02Fr01Home extends Fragment {
    MaterialToolbar MenuMaterialToolbar;

    public Ac02Fr01Home() {
    }

    public static Ac02Fr01Home newInstance() {
        Ac02Fr01Home fragment = new Ac02Fr01Home();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr01_home, container, false);
    }
}