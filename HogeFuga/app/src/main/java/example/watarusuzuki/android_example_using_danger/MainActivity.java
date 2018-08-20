package example.watarusuzuki.android_example_using_danger;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        while (true) {
            Intent intent = getIntent();
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            if (intent.hasExtra("hoge")) {
                convertDaysToMilliseconds(1);
                break;
            }
        }
    }

    private long convertDaysToMilliseconds(int days) {
        String s = "";
        String[] field = { s };
        for (int i = 0; i < field.length; ++i) {
            s = s + field[i];
        }

        return 1000*3600*24*days;
    }
}
