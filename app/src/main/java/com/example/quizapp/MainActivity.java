package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button true_button;
    private Button false_button;
    private int m_index;
    private TextView question_text;
    private TextView score_card;
    int mquestion;

    private  trueorfalse[] question_bank=new trueorfalse[]{
            new trueorfalse(R.string.question_1,true),
            new trueorfalse(R.string.question_2,false),
            new trueorfalse(R.string.question_3,false),
            new trueorfalse(R.string.question_4,true),
            new trueorfalse(R.string.question_5,true),
            new trueorfalse(R.string.question_6,false),
            new trueorfalse(R.string.question_7,false),
            new trueorfalse(R.string.question_8,true),
            new trueorfalse(R.string.question_9,false),
            new trueorfalse(R.string.question_10,true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        true_button=(Button)findViewById(R.id.true_button);
        false_button=(Button)findViewById(R.id.false_button);
        question_text=(TextView)findViewById(R.id.question_text);
        mquestion=question_bank[m_index].getMquestionid();
        question_text.setText(mquestion);
        score_card=(TextView)findViewById(R.id.score_card);

        true_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast my_toast= Toast.makeText(getApplicationContext(),"Button pressed",Toast.LENGTH_SHORT);
                my_toast.show();
                check_answer(true);
                update_question();

            }
        });

        false_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast my_toast= Toast.makeText(getApplicationContext(),"Button pressed",Toast.LENGTH_SHORT);
                my_toast.show();
                check_answer(false);
                update_question();

            }
        });
    }

    private void update_question()

    {
        m_index=(m_index+1)%question_bank.length;
        mquestion=question_bank[m_index].getMquestionid();
        question_text.setText(mquestion);
    }

    private void check_answer(boolean userselction)
    {
        boolean correct_answer=question_bank[m_index].isManswer();
        if(userselction==correct_answer)
        {
            Toast newtoa=Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT);
        }
        else
        {
            Toast newtoas=Toast.makeText(getApplicationContext(),"Correct",Toast.LENGTH_SHORT);
        }
    }
}
