package sg.edu.rp.c346.id19031965.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Declare Variable
    Button btnClick;
    TextView tvDisplay;
    EditText etInput;
    ToggleButton tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = findViewById(R.id.buttonClick);
        tvDisplay = findViewById(R.id.textViewDisplay);
        etInput = findViewById(R.id.editTextInput);
        tbtn = findViewById(R.id.toggleButtonEnabled);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Handle button click event here
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                tvDisplay.setText(stringResponse);
                Toast.makeText(MainActivity.this, stringResponse = etInput.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
