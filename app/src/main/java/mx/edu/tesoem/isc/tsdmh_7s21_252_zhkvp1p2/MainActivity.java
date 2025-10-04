package mx.edu.tesoem.isc.tsdmh_7s21_252_zhkvp1p2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnsum,btnres,btnmulti,btndiv,btnpo,btnpoten,btnraiz;
    TextView lblresultados;

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
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        btnsum = findViewById(R.id.btnsum);
        btnres = findViewById(R.id.btnres);
        btnmulti = findViewById(R.id.btnmulti);
        btndiv = findViewById(R.id.btndiv);
        btnpo = findViewById(R.id.btnpo);
        btnpoten = findViewById(R.id.btnpoten);
        btnraiz = findViewById(R.id.btnraiz);
        lblresultados = findViewById(R.id.lblresultados);
    }
    public void onclicksuma(View v) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = String.valueOf(num1 + num2);
        lblresultados.setText(cadena);
    }
    public void onclickres(View v) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = String.valueOf(num1 - num2);
        lblresultados.setText(cadena);
    }
    public void onclickmul(View v) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = String.valueOf(num1 * num2);
        lblresultados.setText(cadena);
    }
    public void onclickdivi(View v) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = String.valueOf(num1 / num2);
        lblresultados.setText(cadena);
    }
    public void onclickpotencia(View v) {
        int num1;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        String cadena = String.valueOf(num1 ^ 2);
        lblresultados.setText(cadena);
    }
    public void onclickpotenciaN(View v) {
        int num1, num2;
        num1 = Integer.parseInt(txtnum1.getText().toString());
        num2 = Integer.parseInt(txtnum2.getText().toString());
        String cadena = String.valueOf(num1 ^ num2);
        lblresultados.setText(cadena);
    }
    public void onclickRaiz(View view){
        int num1;
        num1 = Integer.parseInt(txtnum1.getText().toString());

        // Math.sqrt devuelve un double
        double resultado = Math.sqrt(num1);

        String cadenaRaiz = "La raíz cuadrada de " + num1 + " es: " + resultado;
        lblresultados.setText(cadenaRaiz);
    }
}