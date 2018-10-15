package br.usjt.sin.progmulti.clientesi18;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/*@Author: Vinicius Ferreira
 *RA: 817127791
 */

public class DetalheFilmeActivity extends Activity {
    private TextView nome, tipo, data;
    private ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_filme);
        nome = findViewById(R.id.detalhe_txt_nome);
        tipo = findViewById(R.id.detalhe_txt_tipo);
        data = findViewById(R.id.detalhe_txt_data);
        foto = findViewById(R.id.detalhe_foto_filme);

        Intent intent = getIntent();
        Filme filme = (Filme)intent.getSerializableExtra(ListaFilmesActivity.FILME);
        nome.setText(filme.getNome().toString());
        tipo.setText(filme.getTipo().toString());
        data.setText(filme.getData().toString());
        foto.setImageDrawable(Util.getImagem(this, filme.getFoto()));
    }
}
