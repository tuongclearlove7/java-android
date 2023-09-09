package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public static final String Tag = MainActivity.class.getSimpleName();
    EditText edit_duong;
    Button btn_chuyen;
    TextView txt_amlich;

    Button btn_clear, btn_fc, btn_cf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_duong = findViewById(R.id.edit_duong);
        txt_amlich = findViewById(R.id.txt_amlich);
        btn_chuyen = findViewById(R.id.btn_chuyen);

        btn_chuyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String  CAN_[]={"Canh ", "Tân ", "Nhâm ", "Qúy ", "Giáp ", "Ất ", "Bính ", "Đinh ", "Mậu ", "Kỷ "};
                String  CHI_[]={"Thân", "Dậu", "Tuất", "Hợi", "Tý", "Sửu", "Dần", "Mẹo", "Thìn", "Tị", "Ngọ","Mùi"};
                String can = "",chi = "";
                int nam_duong = Integer.parseInt(edit_duong.getText().toString());

                for(int i =0; i<CAN_.length; i++){
                    if(nam_duong%10 == i){
                        can = CAN_[i];
                        break;
                    }
                }

                for(int i =0; i<CHI_.length; i++){
                    if(nam_duong%12 == i){
                        chi = CHI_[i];
                        break;
                    }
                }

                txt_amlich.setText(can + "" + chi);




            }
        });



    }
}