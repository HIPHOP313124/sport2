package com.example.mac.sport2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreteamA;
    private int scoreteamB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForA(int score){
        TextView scoreview=(TextView)findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }
    public void displayForB(int score){
        TextView scoreview=(TextView)findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }




    public void mediator(View view){
        if (view.getId()==R.id.fractionA3){
            scoreteamA+=3;
            displayForA(scoreteamA);

        }else if(view.getId()==R.id.fractionA2){
            scoreteamA+=2;
            displayForA(scoreteamA);

        }else if(view.getId()==R.id.fractionA1){
            scoreteamA+=1;
            displayForA(scoreteamA);


        }else if (view.getId()==R.id.fractionB3){
            scoreteamB+=3;
            displayForB(scoreteamB);

        }else if(view.getId()==R.id.fractionB2){
            scoreteamB+=2;
            displayForB(scoreteamB);
        }else if (view.getId()==R.id.fractionB1){
            scoreteamB+=1;
            displayForB(scoreteamB);
        }else if(view.getId()==R.id.resetid){
            scoreteamA=0;
            scoreteamB=0;
            displayForA(scoreteamA);
            displayForB(scoreteamB);
        }
    }
}

