package my.edu.tarc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView TextViewMsg; //TextView = a class
                                  //textViewMsg = instance
    private TextView TextClearMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate() = main() function
        super.onCreate(savedInstanceState);
        //Display UI
        //R = resource class
        //layout = is a folder
        setContentView(R.layout.activity_main);


        //Link UI to program
        TextViewMsg = findViewById(R.id.TextViewMessage);
        TextViewMsg.setText("Hello,イタチ");
    }

    public void showMessage(View view){
        TextViewMsg.setText("Hello,イタチ");
    }

    public void clearMessage(View clear){
        TextClearMsg.setText("")
        ;
    }

}

