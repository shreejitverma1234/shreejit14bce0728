package happy.shreejithour.gmail.com.happyhours;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button loginBtn;
    EditText userName,password;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginBtn = (Button) findViewById(R.id.button2);
        password = (EditText) findViewById(R.id.editText18);
        userName = (EditText) findViewById(R.id.editText17);
        counter=0;

        loginBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2)
        {
            if(userName.getText().toString().equals("Shreejit") && password.getText().toString().equals("shree") )
            {
                counter++;
                Toast.makeText(Login.this,"Login Successful",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Login.this,Home.class);
                intent.putExtra("check",counter);
                startActivity(intent);
                finish();

            }
            else
            {
                Toast.makeText(Login.this,"Invalid Credentials, Please try again!",Toast.LENGTH_LONG).show();
            }
        }
    }
}
