package team_galaxy.hnginterns.hngmobileapp.ui.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.OnClick;
import team_galaxy.hnginterns.hngmobileapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SignUpFragment extends Fragment {


    public SignUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup, container, false);
    }

    @OnClick(R.id.text_login)
    public void openLoginFragment(){
        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.frame_user_authentication,new LoginFragment())
                .commit();
    }

}
