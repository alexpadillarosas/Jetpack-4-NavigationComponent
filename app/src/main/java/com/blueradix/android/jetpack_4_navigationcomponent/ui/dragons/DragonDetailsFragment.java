package com.blueradix.android.jetpack_4_navigationcomponent.ui.dragons;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.blueradix.android.jetpack_4_navigationcomponent.Model.Dragon;
import com.blueradix.android.jetpack_4_navigationcomponent.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class DragonDetailsFragment extends Fragment {


    public DragonDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dragon_details, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView nameTextView = getView().findViewById(R.id.nameTextView);
        TextView descTextView = getView().findViewById(R.id.descTextView);
        ImageView dragonImageView = getView().findViewById(R.id.dragonImageView);
        TextView typeTextView = getView().findViewById(R.id.typeTextView);

        /*
        This is without safeargs, we will need the key to get the object passed, therefore it's not type safe
        Bundle arguments = this.getArguments();
        Dragon drag = (Dragon)arguments.getSerializable("drag");
        */

        DragonDetailsFragmentArgs args = DragonDetailsFragmentArgs.fromBundle(getArguments());
        Dragon dragon = args.getDragon();

//        Log.i("bla", dragon.toString());

        nameTextView.setText(dragon.getName());
        descTextView.setText(dragon.getDescription());
        dragonImageView.setImageResource(dragon.getResId());
        typeTextView.setText(dragon.getType().toString());


    }
}
