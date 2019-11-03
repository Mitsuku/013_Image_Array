package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

@SuppressWarnings("ControlFlowStatementWithoutBraces")
public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText h;
    public ImageView iv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv1 = (ImageView) findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button);
        h = (EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float fh = Float.parseFloat(h.getEditableText().toString());
                float fresult;
                fresult = fh;
                if (fresult==1)
                    (iv1).setImageResource(R.drawable.a1);
                else if (fresult==2)
                    (iv1).setImageResource(R.drawable.a2);
                else if (fresult==3)
                    (iv1).setImageResource(R.drawable.a3);
                else if (fresult==4)
                    (iv1).setImageResource(R.drawable.a4);
                else if (fresult==5)
                    (iv1).setImageResource(R.drawable.a5);
                else if (fresult==6)
                    (iv1).setImageResource(R.drawable.a6);
                else if (fresult==7)
                    (iv1).setImageResource(R.drawable.a7);
                else if (fresult==8)
                    (iv1).setImageResource(R.drawable.a8);
                else if (fresult==9)
                    (iv1).setImageResource(R.drawable.a9);
                else if (fresult==10)
                    (iv1).setImageResource(R.drawable.a0);


            }
    });

    }

}

