package sv.edu.udb.appoperario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);


        TextView tv;
        Bundle bundle = getIntent().getExtras();

        tv = (TextView)findViewById(R.id.tvSueldo);
        tv.setText("$" + bundle.getString("sueldo"));

        tv = (TextView)findViewById(R.id.tvAnios);
        tv.setText(bundle.getString("anios"));

        tv = (TextView)findViewById(R.id.tvPorcAumento);
        tv.setText("$" + bundle.getString("porcentajeAumento"));

        tv = (TextView)findViewById(R.id.tvAumento);
        tv.setText("$" + bundle.getString("valorAumento"));

        tv = (TextView)findViewById(R.id.tvResultado);
        tv.setText("$" + bundle.getString("sueldoResultante"));
    }
}