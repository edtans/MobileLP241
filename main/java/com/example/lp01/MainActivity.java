package com.example.lp01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel
    private EditText txtUser_code;
    private EditText txtPass_code;
    private Button btnLogin_code;
    private TextView lblHasil_code;
    private String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //konfigurasi
        txtUser_code = (EditText) findViewById(R.id.txtUser);
        txtPass_code = (EditText) findViewById(R.id.txtPass);
        btnLogin_code = (Button) findViewById(R.id.btnLogin);
        lblHasil_code = (TextView) findViewById(R.id.lblHasil);

        //ketika btnLogin diklik
        btnLogin_code.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //lblHasil_code.setText("Button login sudah diklik");

                //tampung data
                user = txtUser_code.getText().toString();
                pass = txtPass_code.getText().toString();

                //cek jika user=admin; pass=12345
                if (user.equals("admin") && pass.equals("12345"))
                {
                    lblHasil_code.setText("login berhasil");
                    Toast.makeText(getApplicationContext(),"login berhasil",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    lblHasil_code.setText("login gagal");
                    Toast.makeText(getApplicationContext(),"login gagal",Toast.LENGTH_LONG).show();
                }



            }
        });



    }
}