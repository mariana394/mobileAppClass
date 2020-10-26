package mx.tec.example3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);

        myButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //   myTextView.setText("You clicked me"); /*cuando quiero comentar mas de una*/

                    Intent i= new Intent(MainActivity.this,ChildActivity.class);
                    i.putExtra("myInt",58);
                    i.putExtra("myParam","I am the value of this parameter");

                    startActivity(i);
                }


        });

    }


}