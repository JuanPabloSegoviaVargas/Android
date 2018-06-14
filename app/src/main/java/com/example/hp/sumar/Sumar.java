package com.example.hp.sumar;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class Sumar extends AppCompatActivity {
    EditText et1,et2;
    TextView tv1;
    RadioButton r1,r2;
    CheckBox c1,c2;
    Spinner sp1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        tv1=(TextView)findViewById(R.id.textView3);
        r1= (RadioButton)findViewById(R.id.radioButton);
        r2=(RadioButton)findViewById(R.id.radioButton2);
        c1=(CheckBox)findViewById(R.id.checkBox);
        c2=(CheckBox)findViewById(R.id.checkBox2);
        sp1=(Spinner)findViewById(R.id.spinner);
        //Sp1 o spinner crea opciones en un vector que selecciona la opcion y cumple una funcion
        String []opciones={"sumar","restar","multiplicar","dividir"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);
    }
    public void Sum (View view){
        int s1,s2,r;
        s1 = Integer.parseInt(et1.getText().toString());
        s2= Integer.parseInt(et2.getText().toString());

        if(r1.isChecked()==true){
            r= s1-s2;

            tv1.setText(String.valueOf(r));
            r2.setChecked(false);
        } if(r2.isChecked()==true){
            r= s1+s2;
            tv1.setText(String.valueOf(r));
            r1.setChecked(false);

        }if(c1.isChecked()==true){
            r= s1*s2;
            tv1.setText(String.valueOf(r));
            c1.setChecked(false);
        }if(c2.isChecked()==true){
            r= s1/s2;

            tv1.setText(String.valueOf(r));
        }
        //creando la variable selec para obtener el valor seleccionado en el apk
        String selec=sp1.getSelectedItem().toString();

        if(selec.equals("sumar")){
            r=s1+s2;
            tv1.setText(String.valueOf(r));
        }else if(selec.equals("restar")){
            r= s1-s2;

            tv1.setText(String.valueOf(r));
        }else if(selec.equals("multiplicar")){

            r= s1*s2;
            tv1.setText(String.valueOf(r));
        }else if(selec.equals("dividir")){
            r= s1/s2;

            tv1.setText(String.valueOf(r));
        }

    }


}
