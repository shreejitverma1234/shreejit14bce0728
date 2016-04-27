package happy.shreejithour.gmail.com.happyhours;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {

    private Button btn,btn1,btn2,btn3,btn4,btn5;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn = (Button) findViewById(R.id.button10);
        btn1 = (Button) findViewById(R.id.button5);
        btn2 = (Button) findViewById(R.id.button6);
        btn3 = (Button) findViewById(R.id.button7);
        btn4 = (Button) findViewById(R.id.button8);
        btn5 = (Button) findViewById(R.id.button9);

        btn.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);

        Bundle extras = getIntent().getExtras();

        if(extras == null)
        {
            return;
        }
        else
        {
            if(extras.getInt("check") ==1)
            {
                btn1.setText("LOGOUT");
            }
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button5:
                if(btn1.getText().toString().equals("LOGIN")) {
                    Intent intent6 = new Intent(Home.this, Login.class);
                    startActivity(intent6);
                }
                else
                {
                    btn1.setText("LOGIN");
                }
                break;
            case R.id.button6:
                Intent intent = new Intent(Home.this,Emergency.class);
                startActivity(intent);
                break;
            case R.id.button7:
                Intent intent1 = new Intent(Home.this,Contactus.class);
                startActivity(intent1);
                break;
            case R.id.button8:
                Intent intent2 = new Intent(Home.this,Personal.class);
                startActivity(intent2);
                break;
            case R.id.button9:
                Intent intent3 = new Intent(Home.this,MainActivity.class);
                startActivity(intent3);
                break;
            case R.id.button10:
                Intent intent4 = new Intent(Home.this,Aboutus.class);
                startActivity(intent4);
                break;
        }
    }
}
