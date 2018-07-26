package com.example.lucas.treinocheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkCachorro;
    private CheckBox checkGato;
    private CheckBox checkVaca;
    private Button mostrar;
    private TextView exibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkCachorro = (CheckBox) findViewById(R.id.cachorroId);
        checkGato = (CheckBox) findViewById(R.id.gatoId);
        checkVaca = (CheckBox) findViewById(R.id.vacaId);
        mostrar = (Button) findViewById(R.id.botaoId);
        exibir = (TextView) findViewById(R.id.exibirId);

        mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itensSelecionados = "";
                itensSelecionados +=
                        "Item: "+checkCachorro.getText()+"status: "+checkCachorro.isChecked()+
                        "\nItem: "+checkGato.getText()+"status: "+checkGato.isChecked()+
                        "\nItem: "+checkVaca.getText()+"status: "+checkVaca.isChecked();

                exibir.setText(itensSelecionados);
            }
        });

    }
}
