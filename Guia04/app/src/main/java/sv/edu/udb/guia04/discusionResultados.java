package sv.edu.udb.guia04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class discusionResultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discusion_resultados);
    }

    public void sendData(View v){

        String name = (String)findViewById(R.id.txtWorkerName).toString();
        String workedHours = (String)findViewById(R.id.txtWorkedHours).toString();

        double salary = Integer.parseInt(workedHours) * 8.5;

        double isss = salary * 0.02;
        double afp = salary * 0.03;
        double renta = salary * 0.04;

        double totalDiscounts = isss - afp - renta;

        salary -= totalDiscounts;

        Intent i = new Intent(this, segundaActividad.class);
        i.putExtra("workerName", name);
        i.putExtra("salary", salary);
        i.putExtra("isss", isss);
        i.putExtra("afp", afp);
        i.putExtra("renta", renta);
        i.putExtra("totalDiscounts", totalDiscounts);
        startActivity(i);
    }
}