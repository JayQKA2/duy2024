package vn.edu.usth.weather;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import vn.edu.usth.weather.Fragment.WeatherAdapter;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate");
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_weather);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
//
//        ForecastFragment firstFragment = new ForecastFragment();
//        getSupportFragmentManager().beginTransaction().add(R.id.container, firstFragment).commit();
        setContentView(R.layout.activity_weather);


        ViewPager viewPager = findViewById(R.id.view_pager);
        FragmentPagerAdapter adapter = new WeatherAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setText(getString(R.string.tab_view));
        tabLayout.getTabAt(1).setText(getString(R.string.tab_hanoi));
        tabLayout.getTabAt(2).setText(getString(R.string.tab_paris));
        tabLayout.getTabAt(3).setText(getString(R.string.tab_spain));

//        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.rickroll);
//        mediaPlayer.start();
        try (InputStream inputStream = getResources().openRawResource(R.raw.rickroll);
             OutputStream outputStream = new FileOutputStream(new File(getFilesDir(), "rickroll.mp3"))) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
        } catch (IOException e) {
            Log.e(TAG, "Error copying media file", e);
        }

        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(new File(getFilesDir(), "rickroll.mp3").getPath());
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            Log.e(TAG, "Error playing media file", e);
        }

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}