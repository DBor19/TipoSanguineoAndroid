package rj.senac.br.tiposanguineo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ActionButton(View v) {
        EditText etN = findViewById(R.id.editTextText);
        TextView textViewResult = findViewById(R.id.textViewResult);

        String s = etN.getText().toString().toUpperCase();

        String result = new TipoSanguineo().calcularCompatibilidade(s);

        // Atualiza o texto do TextView com o resultado
        textViewResult.setText(result);

    }
}