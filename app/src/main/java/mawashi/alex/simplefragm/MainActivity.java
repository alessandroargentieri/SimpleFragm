package mawashi.alex.simplefragm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getFragmentManager()
                    .beginTransaction()
                    .add(R.id.fragmentParentViewGroup, new MyFragment())
                    .commit();
        }


    }


    public void Change(View v){
        getFragmentManager().beginTransaction()
                .replace(R.id.fragmentParentViewGroup, new MySecondFragment())
                .addToBackStack(null)
                .commit();

    }


}
