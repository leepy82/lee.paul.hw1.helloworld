package lee.paul.hw1;

import lee.paul.hw1.helloworld.R;
import android.app.Activity;
import android.os.Bundle;

public class helloworldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}