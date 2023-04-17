package com.example.ridar;

import static android.app.Activity.RESULT_OK;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.net.Uri;

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
    Button browseFilesButton;
    TextView selectedImageTextView;
    ImageView selectedImageImageView;
    int SELECT_IMAGE = 200;

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
        View view = inflater.inflate(R.layout.fragment_ac02_fr03_create_submission, container, false);
        browseFilesButton = view.findViewById(R.id.image_chooser_button);
        selectedImageTextView = view.findViewById(R.id.image_chooser_uri_text_view);
        selectedImageImageView = view.findViewById(R.id.selected_image_image_view);
        Log.d("Image Chooser - ", "Button clicked beta.\n\n");

        browseFilesButton.setOnClickListener(view1 -> {
            Log.d("Image Chooser - ", "Button clicked 0.\n\n");
            imageChooser();
        });

        return view;
    }

    public void imageChooser () {
        Log.d("Image Chooser - ", "Button clicked 1.\n\n");
        Intent intent = new Intent ();
        intent.setType("image/* video/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        Log.d("Image Chooser - ", "Button clicked 2.\n\n");

        startActivityForResult(Intent.createChooser(intent, "Select Image"), SELECT_IMAGE);
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (resultCode == RESULT_OK) {
            if (requestCode == SELECT_IMAGE) {
                Uri selectedImageUri = intent.getData();
                if (selectedImageUri != null) {
                    selectedImageImageView.setImageURI(selectedImageUri);
                }
            }
        }
    }

}