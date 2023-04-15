package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.09
// Donate
/*
    TextView ["Donate to RiDar", DonationRequestTextView]
    Button [MakeDonationButton (to Patreon page), BackButton (to Ac02Fr01Home)]
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - setup accounts with patreon, etc. to accept donations
 *   - investigate widget/embeddable/api for builtin donation options
 */

public class Ac02Fr09Donate extends Fragment {

    public Ac02Fr09Donate() {
    }

    public static Ac02Fr09Donate newInstance() {
        Ac02Fr09Donate fragment = new Ac02Fr09Donate();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr09_donate, container, false);
    }
}