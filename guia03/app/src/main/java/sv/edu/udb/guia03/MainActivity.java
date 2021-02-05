package sv.edu.udb.guia03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int i = 0;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new MyLifeCycleObserver());
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv1.setText(String.valueOf(i));
    }

    public void addOne(View view){

        if(i < 9 ){
            i++;
        }else{
            i = 0;
        }
        tv1.setText(String.valueOf(i));

    }

}