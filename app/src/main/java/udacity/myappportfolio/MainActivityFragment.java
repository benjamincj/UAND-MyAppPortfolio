package udacity.myappportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static Context context;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        context = getActivity();

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Button button = (Button) rootView.findViewById(R.id.button);
        final String buttonTitle = "Spotify Streamer";
        button.setText(buttonTitle);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = getToast(buttonTitle);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
        });

        Button button2 = (Button) rootView.findViewById(R.id.button2);
        final String buttonTitle2 = "Scores App";
        button2.setText(buttonTitle2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = getToast(buttonTitle2);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
        });

        Button button3 = (Button) rootView.findViewById(R.id.button3);
        final String buttonTitle3 = "Library App";
        button3.setText(buttonTitle3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = getToast(buttonTitle3);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
        });

        Button button4 = (Button) rootView.findViewById(R.id.button4);
        final String buttonTitle4 = "Build It Bigger";
        button4.setText(buttonTitle4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = getToast(buttonTitle4);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
        });

        Button button5 = (Button) rootView.findViewById(R.id.button5);
        final String buttonTitle5 = "XYZ Reader";
        button5.setText(buttonTitle5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = getToast(buttonTitle5);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
        });

        Button button6 = (Button) rootView.findViewById(R.id.button6);
        final String buttonTitle6 = "Capstone: My Own App";
        button6.setText(buttonTitle6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = getToast(buttonTitle6);
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                toast.show();
            }
        });

        return rootView;
    }

    public Toast getToast(String title){
        return Toast.makeText(context, "This button will launch "+title, Toast.LENGTH_LONG);
    }

}
