package mendes.nascimento.nycolly.appemail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DEFIIÇÃO DO BOTÃO
        Button btnEnvir= findViewById(R.id.btnEnviar);
        // DEFINIÇÃO DO CLICK DO BOTÃO
        btnEnvir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //registrando od dados informados pelo usuário
                EditText etEmail = (EditText) findViewById(R.id.etEmail);
                String email = etEmail.getText().toString();

                EditText etAssunto =(EditText) findViewById(R.id.etAssunto);
                String assunto = etAssunto.getText().toString();

                EditText etTexto =(EditText) findViewById(R.id.etTexto);
                String texto = etTexto.getText().toString();


                Intent I = new Intent(Intent.ACTION_SENDTO);
                I.setData(Uri.EMPTY.parse("mailto:"));

                String[] emails = new String[] {email} ;
                I.putExtra(Intent.EXTRA_EMAIL,emails);
                I.putExtra(Intent.EXTRA_SUBJECT, assunto);
                I.putExtra(Intent.EXTRA_TEXT,texto);
                try {
                    startActivity(Intent.createChooser(I, "Escolha o APP"));
                }


                catch (ActivityNotFoundException e ) {
                    Toast.makeText(MainActivity.this,"Não há nenhum app que posso realizar essa operação", Toast.LENGTH_LONG).show();
                    }

                
            }
        });

    }
}
