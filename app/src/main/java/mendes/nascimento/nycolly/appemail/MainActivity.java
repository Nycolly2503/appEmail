package mendes.nascimento.nycolly.appemail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Enviar= findViewById(R.id.btnEnviar);
        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText email= findViewById(R.id.etDigiteEmail);
                EditText Assunto = findViewById(R.id.etAssunto);



            }
        });
    }
}