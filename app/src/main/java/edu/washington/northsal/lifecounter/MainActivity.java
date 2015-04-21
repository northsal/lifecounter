package edu.washington.northsal.lifecounter;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    int p1Count;
    int p2Count;
    int p3Count;
    int p4Count;

    TextView p1Text;
    TextView p2Text;
    TextView p3Text;
    TextView p4Text;
    TextView loserMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        p1Count = 20;
        p2Count = 20;
        p3Count = 20;
        p4Count = 20;

        p1Text = (TextView) findViewById(R.id.player1);
        p2Text = (TextView) findViewById(R.id.player2);
        p3Text = (TextView) findViewById(R.id.player3);
        p4Text = (TextView) findViewById(R.id.player4);
        loserMessage = (TextView) findViewById(R.id.loserMessage);


        final Button btnP1Plus = (Button) findViewById(R.id.btnP1Plus);
        final Button btnP1Minus = (Button) findViewById(R.id.btnP1Minus);
        final Button btnP1Plus5 = (Button) findViewById(R.id.btnP1Plus5);
        final Button btnP1Minus5 = (Button) findViewById(R.id.btnP1Minus5);

        final Button btnP2Plus = (Button) findViewById(R.id.btnP2Plus);
        final Button btnP2Minus = (Button) findViewById(R.id.btnP2Minus);
        final Button btnP2Plus5 = (Button) findViewById(R.id.btnP2Plus5);
        final Button btnP2Minus5 = (Button) findViewById(R.id.btnP2Minus5);

        final Button btnP3Plus = (Button) findViewById(R.id.btnP3Plus);
        final Button btnP3Minus = (Button) findViewById(R.id.btnP3Minus);
        final Button btnP3Plus5 = (Button) findViewById(R.id.btnP3Plus5);
        final Button btnP3Minus5 = (Button) findViewById(R.id.btnP3Minus5);

        final Button btnP4Plus = (Button) findViewById(R.id.btnP4Plus);
        final Button btnP4Minus = (Button) findViewById(R.id.btnP4Minus);
        final Button btnP4Plus5 = (Button) findViewById(R.id.btnP4Plus5);
        final Button btnP4Minus5 = (Button) findViewById(R.id.btnP4Minus5);

        btnP1Plus.setOnClickListener(onClickListener);
        btnP1Minus.setOnClickListener(onClickListener);
        btnP1Plus5.setOnClickListener(onClickListener);
        btnP1Minus5.setOnClickListener(onClickListener);

        btnP2Plus.setOnClickListener(onClickListener);
        btnP2Minus.setOnClickListener(onClickListener);
        btnP2Plus5.setOnClickListener(onClickListener);
        btnP2Minus5.setOnClickListener(onClickListener);

        btnP3Plus.setOnClickListener(onClickListener);
        btnP3Minus.setOnClickListener(onClickListener);
        btnP3Plus5.setOnClickListener(onClickListener);
        btnP3Minus5.setOnClickListener(onClickListener);

        btnP4Plus.setOnClickListener(onClickListener);
        btnP4Minus.setOnClickListener(onClickListener);
        btnP4Plus5.setOnClickListener(onClickListener);
        btnP4Minus5.setOnClickListener(onClickListener);

    }

    private OnClickListener onClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){
                case R.id.btnP1Plus:
                    p1Count++;
                    p1Text.setText("Player 1: " + p1Count);
                    if(p1Count <= 0 ) {
                        loserMessage.setText("Player 1 loses!");
                    }
                break;
                case R.id.btnP1Minus:
                    p1Count--;
                    p1Text.setText("Player 1: " + p1Count);
                    if(p1Count <= 0 ) {
                        loserMessage.setText("Player 1 loses!");
                    }
                break;
                case R.id.btnP1Minus5:
                    p1Count = p1Count - 5;
                    p1Text.setText("Player 1: " + p1Count);
                    if(p1Count <= 0 ) {
                        loserMessage.setText("Player 1 loses!");
                    }
                break;
                case R.id.btnP1Plus5:
                    p1Count = p1Count + 5;
                    p1Text.setText("Player 1: " + p1Count);
                    if(p1Count <= 0 ) {
                        loserMessage.setText("Player 1 loses!");
                    }
                break;
                case R.id.btnP2Plus:
                    p2Count++;
                    p2Text.setText("Player 2: " + p2Count);
                    if(p2Count <= 0 ) {
                        loserMessage.setText("Player 2 loses!");
                    }
                break;
                case R.id.btnP2Plus5:
                    p2Count = p2Count + 5;
                    p2Text.setText("Player 2: " + p2Count);
                    if(p2Count <= 0 ) {
                        loserMessage.setText("Player 2 loses!");
                    }
                break;
                case R.id.btnP2Minus:
                    p2Count--;
                    p2Text.setText("Player 2: " + p2Count);
                    if(p2Count <= 0 ) {
                        loserMessage.setText("Player 2 loses!");
                    }
                break;
                case R.id.btnP2Minus5:
                    p2Count = p2Count - 5;
                    p2Text.setText("Player 2: " + p2Count);
                    if(p2Count <= 0 ) {
                        loserMessage.setText("Player 2 loses!");
                    }
                break;
                case R.id.btnP3Plus:
                    p3Count++;
                    p3Text.setText("Player 3: " + p3Count);
                    if(p3Count <= 0 ) {
                        loserMessage.setText("Player 3 loses!");
                    }
                break;
                case R.id.btnP3Plus5:
                    p3Count = p3Count + 5;
                    p3Text.setText("Player 3: " + p3Count);
                    if(p3Count <= 0 ) {
                        loserMessage.setText("Player 3 loses!");
                    }
                break;
                case R.id.btnP3Minus:
                    p3Count--;
                    p3Text.setText("Player 3: " + p3Count);
                    if(p3Count <= 0 ) {
                        loserMessage.setText("Player 3 loses!");
                    }
                break;
                case R.id.btnP3Minus5:
                    p3Count = p3Count - 5;
                    p3Text.setText("Player 3: " + p3Count);
                    if(p3Count <= 0 ) {
                        loserMessage.setText("Player 3 loses!");
                    }
                break;
                case R.id.btnP4Plus:
                    p4Count++;
                    p4Text.setText("Player 4: " + p4Count);
                    if(p4Count <= 0 ) {
                        loserMessage.setText("Player 4 loses!");
                    }
                break;
                case R.id.btnP4Plus5:
                    p4Count = p4Count + 5;
                    p4Text.setText("Player 4: " + p4Count);
                    if(p4Count <= 0 ) {
                        loserMessage.setText("Player 4 loses!");
                    }
                break;
                case R.id.btnP4Minus:
                    p4Count--;
                    p4Text.setText("Player 4: " + p4Count);
                    if(p4Count <= 0 ) {
                        loserMessage.setText("Player 4 loses!");
                    }
                break;
                case R.id.btnP4Minus5:
                    p4Count = p4Count - 5;
                    p4Text.setText("Player 4: " + p4Count);
                    if(p4Count <= 0 ) {
                        loserMessage.setText("Player 4 loses!");
                    }
                break;
            }
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
