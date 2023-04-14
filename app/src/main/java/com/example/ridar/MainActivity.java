package com.example.ridar;

/*
Activity 02
MainActivity

- Nested Fragments -

fragment 02.01
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

fragment 02.02
Search
SearchView [MainSearchView (to Ac02Fr05SearchResults]
^ https://developer.android.com/develop/ui/views/search/search-dialog ^

fragment 02.03
CreateSubmission
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

fragment 02.04
SubmissionHistory
RecyclerView [SubmissionRecyclerView]
^ https://developer.android.com/codelabs/basic-android-kotlin-training-recyclerview-scrollable-list#0 ^

fragment 02.05
SearchResults
*RecyclerView [SearchResultsRecyclerView]
Button [StartOverButton (to Ac02Fr02Search)]
*May be a more appropriate view for Submissions type*

fragment 02.06
SuccessfulSubmission
TextView ["Review successfully submitted"]
Button [BackButton (to Ac02Fr03CreateSubmission)

fragment 02.07
ViewSubmission
TextView [CustomerNameTextView, CustomerAddressTextView, ReviewTextView, StarRatingTextView, CommonIssuesTextView]
Button [BackButton (to Ac02Fr05SearchResults)]

fragment 02.08
ShareApp
TextView ["Share with a friend", PlayStoreLinkTextView]
Button [CopyLinkButton (to Copy PlayStoreLinkTextView contents), BackButton (to Ac02Fr01Home)]
^ https://developer.android.com/develop/ui/views/touch-and-input/copy-paste ^

fragment 02.09
Donate
TextView ["Donate to RiDar", DonationRequestTextView]
Button [MakeDonationButton (to Patreon page), BackButton (to Ac02Fr01Home)]

fragment 02.10
FAQ
RecyclerView [FAQRecyclerView]
EditText [UserQuestionEditText]
Button [SubmitQuestionButton (to Ac02Fr11FAQSubmission), BackButton (to Ac02Fr01Home)]

fragment 02.11
FAQSubmission
TextView [ThankYouForQuestionTextView]
Button [BackButton (to Ac02Fr10FAQ), HomeButton (to Ac02Fr01Home)]

fragment 02.12
Contact
TextView [CompanyNameTextView, CompanyEmailTextView]
EditText [NameEditText, EmailEditText, PhoneNumberEditText, ConcernEditText]
CheckBox [ContestReviewCheckBox]
Button [SubmitButton (to Ac01Fr01Home)]
 */

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private MaterialToolbar mainToolbar;
    private DrawerLayout navigationDrawer;
    private NavigationView navigationView;
    private ActionBarDrawerToggle navigationToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainToolbar = findViewById(R.id.main_toolbar);
        setSupportActionBar(mainToolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationDrawer = findViewById(R.id.navigation_drawer_layout);
        navigationView = findViewById(R.id.navigation_view);

        setDrawerContent(navigationView);
    }

    private void setDrawerContent (NavigationView view) {
        view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected (MenuItem item) {
                selectDrawerItem(item);
                return true;
            }
        });
    }

    public void selectDrawerItem (MenuItem item) {
        Fragment currentFragment = null;
        FragmentManager fragmentManager = getSupportFragmentManager();
        Class fragmentClass;
        /*
        TODO
        implement switch case for each menuitem item id
        navigate to the selected fragment
         */
        switch (item.getItemId()) {
            case R.id.submit_fragment:
                fragmentClass = Ac02Fr03CreateSubmission.class;
                break;
            case R.id.history_fragment:
                fragmentClass = Ac02Fr04SubmissionHistory.class;
                break;
            case R.id.share_app_fragment:
                fragmentClass = Ac02Fr08ShareApp.class;
                break;
            case R.id.donate_fragment:
                fragmentClass = Ac02Fr09Donate.class;
                break;
            case R.id.faq_fragment:
                fragmentClass = Ac02Fr10FAQ.class;
                break;
            case R.id.contact_fragment:
                fragmentClass = Ac02Fr12Contact.class;
                break;
            default:
                fragmentClass = Ac02Fr02Search.class;
        }

        try {
            currentFragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        fragmentManager.beginTransaction().replace(R.id.content_layout, currentFragment).commit();
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                navigationDrawer.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}