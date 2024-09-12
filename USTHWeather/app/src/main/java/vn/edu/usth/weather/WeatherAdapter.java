package vn.edu.usth.weather;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherAdapter extends FragmentPagerAdapter {

    public WeatherAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new WeatherAndForecastFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
