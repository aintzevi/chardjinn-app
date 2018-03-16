package com.example.aintzevi.chardjinn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Maximilian on 16.03.18.
 */

public class LeaderboardFragment extends android.support.v4.app.Fragment{

    /**
     * The fragment argument representing the section number for this fragment.
     */
    public static final String ARG_SECTION_NUMBER = "Section";

    /**
     * Returns a new instance of this fragment for the given section number.
     */
    public static LeaderboardFragment newInstance(int sectionNumber) {
        LeaderboardFragment fragment = new LeaderboardFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public LeaderboardFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_leaderboard, container,
                false);

        //ActionBar
        setHasOptionsMenu(true);

/*
        ImageView botImageView = (ImageView)rootView.findViewById(R.id.botImage);
        botImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("fb-messenger://user/");
                //long id = 2064511353834525;
                uri = ContentUris.withAppendedId(uri,2064511353834525L);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });*/

        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

    }
}
