package com.blueradix.android.jetpack_4_navigationcomponent.ui.main;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.blueradix.android.jetpack_4_navigationcomponent.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        //get the id of the button from the view
        Button button = getView().findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the data from the UI
                TextInputEditText userTextInputEditText = getView().findViewById(R.id.userTextInputEditText);
                //if the class MainToSecond does not appear, clean and rebuild the project, safeargs will generate it
                MainFragmentDirections.MainToDragons action = MainFragmentDirections.mainToDragons();
                action.setMessage(userTextInputEditText.getText().toString());
                //pass an attribute
                Navigation.findNavController(view).navigate(action);

                //get a reference to the navigation controller and calls the navigate. this way will be if we do not need to pass anything.
                //Navigation.findNavController(view).navigate(R.id.mainToSecond);

            }
        });
        /*
        you can also use:
        createNavigateOnClickListener() to set up the button listener and navigate to
        a destination

        button.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.mainToSecond, null)

        */
    }



}
