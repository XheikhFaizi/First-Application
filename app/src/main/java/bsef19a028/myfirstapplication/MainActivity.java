package bsef19a028.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView text;
    private EditText edittext;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button =findViewById(R.id.button);
        edittext =findViewById(R.id.editTextTextPersonName2);
        text=findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "HI CONVERSION DONE", Toast.LENGTH_SHORT).show();

                String s=edittext.getText().toString();
                int kg= Integer.parseInt(s);

                double pound = 2.205* kg;

                text.setText("The Coresponding Kg in Pound Is: "+pound);
            }
        });
        


    }

}