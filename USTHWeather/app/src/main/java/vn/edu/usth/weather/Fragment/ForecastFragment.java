package vn.edu.usth.weather.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import vn.edu.usth.weather.R;

public class ForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }
}
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        LinearLayout layout = new LinearLayout(getActivity());
//        layout.setOrientation(LinearLayout.VERTICAL);
//        layout.setBackgroundColor(Color.BLUE);
//
//        TextView textView = new TextView(getActivity());
//        textView.setText("Thursday");
//        textView.setTextSize(30);
//
//        ImageView imageView = new ImageView(getActivity());
//        imageView.setImageResource(R.drawable.cloudy);
//
//        layout.addView(textView);
//        layout.addView(imageView);
//        return layout;
//    }
//}