package sv.edu.udb.appoperario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarInformacion(View view){

        try{

            EditText et;

            //Obtenemos el valor de ambos campos
            et = (EditText) findViewById(R.id.txtSueldo);
            Double sueldo = Double.parseDouble(et.getText().toString());
            et = (EditText) findViewById(R.id.txtAnios);
            int anios = Integer.parseInt(et.getText().toString());
            if(validarCampos(sueldo, anios)){

                //Una vez validados los campos, calculamos el aumento
                double porcentajeAumento = calcularAumento(sueldo, anios);
                double valorAumento = sueldo * porcentajeAumento;
                double sueldoResultante = valorAumento + sueldo;

                DecimalFormat df2 = new DecimalFormat("#.##");
                //Formulamos los parámetros para la activity de resultados
                Intent i  = new Intent(this, resultados.class);
                i.putExtra("sueldo", String.valueOf(df2.format(sueldo)));
                i.putExtra("anios", String.valueOf(anios));
                i.putExtra("porcentajeAumento", String.valueOf(porcentajeAumento));
                i.putExtra("valorAumento", String.valueOf(df2.format(valorAumento)));
                i.putExtra("sueldoResultante", String.valueOf(df2.format(sueldoResultante)));

                startActivity(i);
            }

        }catch(Exception e){

            //Si existe ocurre un problema al hacer la conversión
            String msg = "Formulario inválido, revisa los campos e intentalo nuevamente";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validarCampos(double sueldo, int anios){

        //Validamos si los datos, además de cumplir con los lineamientos de tipo de dato,
        //cumplen con los lineamientos del ejercicio
        if(sueldo >= 100){

            if(anios > 0){

                return true;
            }else{

                Toast.makeText(this, "Años laborados no debe ser inferior a 1", Toast.LENGTH_SHORT).show();
                return false;
            }
        }else{

            Toast.makeText(this, "Sueldo no puede ser menor a $100.00", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private double calcularAumento(double sueldo, int anios){

        //Calculamos el porcentaje a aumentar en base al sueldo y los años de antiguedad del operador
        if(sueldo < 500 && anios >= 10){

            return 0.2;
        }else if(sueldo < 500 && anios < 10){

            return 0.05;
        }else{

            return 0;
        }
    }
}