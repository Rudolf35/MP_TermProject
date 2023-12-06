package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
public class MainActivity extends AppCompatActivity {

    EditText edit;
    TextView text;
    XmlPullParser xpp;

    String key="jDq26DbkKv4OwbSIBvhBX%2BW%2B1XUMQRmtuG6LNgBYXkeTE6T8RBlP%2F2z0rGufEKODqpV3OSKCC2fkAk3MzKIhKA%3D%3D";
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit= (EditText)findViewById(R.id.editText);
        text= (TextView)findViewById(R.id.showText);

    }

    String getXmlData(){
        StringBuffer buffer=new StringBuffer();
        String str= edit.getText().toString();//EditText에 작성된 Text얻어오기
        String location = URLEncoder.encode(str);

        String queryUrl="https://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty?serviceKey=jDq26DbkKv4OwbSIBvhBX%2BW%2B1XUMQRmtuG6LNgBYXkeTE6T8RBlP%2F2z0rGufEKODqpV3OSKCC2fkAk3MzKIhKA%3D%3D&returnType=xml&numOfRows=100&pageNo=1&sidoName="+location+"&ver=1.0";


    }
}