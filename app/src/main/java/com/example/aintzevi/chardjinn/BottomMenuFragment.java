package com.example.aintzevi.chardjinn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Katerina Intzevidou on 13-Mar-18.
 * Email: intz.katerina@gmail.com
 */

public class BottomMenuFragment extends android.support.v4.app.Fragment{

    /**
     * The fragment argument representing the section number for this fragment.
     */
    public static final String ARG_SECTION_NUMBER = "Section";

    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static BottomMenuFragment newInstance(int sectionNumber) {
        BottomMenuFragment fragment = new BottomMenuFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public BottomMenuFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.bottom_menu_fragment, container,
                false);

        //ActionBar
        setHasOptionsMenu(true);


/*        ImageView firstImageView = (ImageView)rootView.findViewById(R.id.firstImg);
        firstImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });*/
//        bossLineView = (View)rootView.findViewById(R.id.bossLineView);

        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
//        getActivity().getActionBar().setTitle("Verwalten");

    }
}
