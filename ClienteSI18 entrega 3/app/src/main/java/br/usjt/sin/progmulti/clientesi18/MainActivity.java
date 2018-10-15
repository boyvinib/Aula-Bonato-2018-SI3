package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/*@Author: Vinicius Ferreira
 *RA: 817127791
 */

public class MainActivity extends Activity {

    private EditText editText;

    public static final String BUSCA = "br.usjt.sin.progmulti.clientesi18.busca";  // final não consegue alterar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.txt_busca);
    }

    public void buscarFilme(View view) {
        String texto = editText.getText().toString();
        Intent intent = new Intent(this,ListaFilmesActivity.class); //dentro do intent coloca o contexto //isso é reflexão, ou seja, um objetvo "olhando" para dentro dele mesmo (recebe o nome da classe e instancia)
        intent.putExtra(BUSCA, texto);
        startActivity(intent);
    }
}
