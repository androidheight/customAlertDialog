package com.example.prabhu.customalertdialog;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btnLogin;
    EditText etUser,etpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog dialog = new Dialog(MainActivity.this);

                //setting custom layout to dialog
                dialog.setContentView(R.layout.custom_alart_layout);
                dialog.setTitle("Login Here !!");

                //initilize the edittext
                 etUser = (EditText) dialog.findViewById(R.id.etUser);

               etpassword = (EditText) dialog.findViewById(R.id.etpassword);
                //adding button click event
                Button btnCancel = (Button) dialog.findViewById(R.id.btn_cancel);
                btnCancel.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                Button btnLogin = (Button) dialog.findViewById(R.id.btn_login);
                btnLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                      if(etUser.getText().toString().equals("admin") && etpassword.getText().toString().equals("admin"));
                        {
                            Toast.makeText(MainActivity.this,"Login successfully!!",Toast.LENGTH_LONG).show();
                            dialog.dismiss();
                        }
                    }
                });



                dialog.show();
            }
        });
    }
}
