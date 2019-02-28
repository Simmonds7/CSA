package org.example.pltw.medialib;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeTextView);

        Greeter greeter = new Greeter();
        welcomeText.setText(greeter.message);


    }

    /**
     * This method is called when the Show Contents button is clicked
     **/
    public void showMedia(View v) {

        TextView outputText = (TextView) findViewById(R.id.mediaLibText);
        //outputText.append("none");
        outputText.append("\nSongs:");

        Song song1 = new Song();
        song1.setTitle("\nJohnny \uD83C\uDD71. Goode");
        outputText.append(song1.getTitle());

        outputText.append("\nBooks:");
        Book book1 = new Book();
        book1.setTitle("\nHarry Potter and The Infinity Gauntlet");
        outputText.append(book1.getTitle());

        outputText.append("\nMovies:");
        Movie movie1 = new Movie();
        movie1.setTitle("\n\uD83C\uDD71eter Griffin and the Infinity Gauntlet");
        outputText.append(movie1.getTitle());
    }
}
