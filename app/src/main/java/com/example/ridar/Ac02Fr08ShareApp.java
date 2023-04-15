package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.08
// Share App
/*
    TextView ["Share with a friend", PlayStoreLinkTextView]
    Button [CopyLinkButton (to Copy PlayStoreLinkTextView contents), BackButton (to Ac02Fr01Home)]
    ^ https://developer.android.com/develop/ui/views/touch-and-input/copy-paste ^
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - automatically copy to clipboard when link clicked
 *   - include unique id in each user link and keep track on server for possibly future promotions
 */

public class Ac02Fr08ShareApp extends Fragment {

    public Ac02Fr08ShareApp() {
    }

    public static Ac02Fr08ShareApp newInstance() {
        Ac02Fr08ShareApp fragment = new Ac02Fr08ShareApp();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr08_share_app, container, false);
    }
}