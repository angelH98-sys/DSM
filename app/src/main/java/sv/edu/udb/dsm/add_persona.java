package sv.edu.udb.dsm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import sv.edu.udb.dsm.datos.Persona;

public class add_persona extends AppCompatActivity {

    EditText edtDUI, edtNombre, etFechaNacimiento, etPeso, etAltura;
    Spinner spinnerGenero;
    String key="",nombre="",dui="", fechaNacimiento = "", peso = "", altura = "", genero = "",accion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_persona);

        inicializar();
    }

    private void inicializar() {
        edtNombre = findViewById(R.id.edtNombre);
        edtDUI = findViewById(R.id.edtDUI);
        etFechaNacimiento = findViewById(R.id.etFechaNacimiento);
        etPeso = findViewById(R.id.etPeso);
        etAltura = findViewById(R.id.etAltura);

        spinnerGenero = (Spinner) findViewById(R.id.spinnerGenero);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.generos, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerGenero.setAdapter(adapter);

        // Obtención de datos que envia actividad anterior
        Bundle datos = getIntent().getExtras();
        key = datos.getString("key");
        dui = datos.getString("dui");
        nombre=datos.getString("nombre");
        fechaNacimiento=datos.getString("fechaNacimiento");
        peso=datos.getString("peso");
        altura=datos.getString("altura");
        genero=datos.getString("genero");
        accion=datos.getString("accion");
        edtDUI.setText(dui);
        edtNombre.setText(nombre);
    }

    public void guardar(View v){
        String nombre = edtNombre.getText().toString();
        String dui = edtDUI.getText().toString();
        String fechaNacimiento = etFechaNacimiento.getText().toString();
        Double peso = Double.parseDouble(etPeso.getText().toString());
        Double altura = Double.parseDouble(etAltura.getText().toString());
        String genero = spinnerGenero.getSelectedItem().toString();
        // Se forma objeto persona
        Persona persona = new Persona(dui, nombre, fechaNacimiento, genero, peso, altura);

        if (accion.equals("a")) { //Agregar usando push()
            personas.refPersonas.push().setValue(persona);
        }
        else // Editar usando setValue
        {
            personas.refPersonas.child(key).setValue(persona);
        }
        finish();
    }
    public void cancelar(View v){
        finish();
    }
}