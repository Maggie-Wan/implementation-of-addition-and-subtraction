package com.example.student.lab0201;



import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends AppCompatActivity {
    TextView quantity;
    TextView price;
    //一般命名變數時，前面加個m代表整個類別可以使用的變數，設定初始值
    private int mQuantity=0;
    private int mPrice=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        quantity=(TextView)findViewById(R.id.quantity);
        price=(TextView)findViewById(R.id.price);
    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void send(View v){
        displaytotalPirce();

    }
    public void displayquantity(){
        String ntoString=String.valueOf(mQuantity);
        quantity.setText(ntoString);
    }
    public void add(View v){
        mQuantity++;
        displayquantity();
        price.setText("");
    }
    public void subtract(View v){
        if(mQuantity>0){
            mQuantity--;
            displayquantity();
        }
        price.setText("");

    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    public void displaytotalPirce(){
        int totalP=mQuantity*mPrice;
        //貨幣格式化=>可以出現$符號
        //Attention：You should import "java.text.NumberFormat" here, or this app will crash.
        String pay=NumberFormat.getCurrencyInstance().format(totalP);
        String msg=pay+(mQuantity==0?"\nFree":"\nThank you!");
        price.setText(msg);

    }
}

