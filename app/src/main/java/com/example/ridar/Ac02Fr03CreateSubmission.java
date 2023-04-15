package com.example.ridar;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

// fragment 02.03
// CreateSubmission
/*
    EditText [CustomerNameEditText, CustomerAddressEditText, ReviewEditText]
    RatingBar [CustomerRatingBar]
    ^ https://developer.android.com/reference/android/widget/RatingBar ^
    CheckBox [LowTipCheckBox, RudeCheckBox, CanceledOrderCheckBox, BadReviewCheckBox, BadCommunicationCheckBox]
    *Intent [FilePickerIntent]
    ^ https://www.youtube.com/watch?v=ZpJ66yzj8pM ^
    ^ https://developers.google.com/android-publisher/upload ^
    ^ https://talkjs.com/resources/chat-file-upload-android/ ^
    Button [SubmitButton (to Ac02Fr06SuccessfulSubmission)
    *For submitting proof*
    *May be better element type for uploading file*
*/

/* TODO
 *   - review and correct naming according to convention
 *   - review and correct unhelpful names
 *   - update fragment index above
 *   - declare and instantiate elements listed above
 *   - post new submissions to server
 */

public class Ac02Fr03CreateSubmission extends Fragment {

    public Ac02Fr03CreateSubmission() {
    }

    public static Ac02Fr03CreateSubmission newInstance() {
        Ac02Fr03CreateSubmission fragment = new Ac02Fr03CreateSubmission();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ac02_fr03_create_submission, container, false);
    }
}