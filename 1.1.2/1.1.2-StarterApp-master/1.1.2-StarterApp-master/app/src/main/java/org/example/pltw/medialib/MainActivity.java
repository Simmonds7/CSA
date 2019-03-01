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

        Song song1 = new Song("\nJohnny \uD83C\uDD71. Goode", 1.29, 9);
        outputText.append(song1.getTitle());
        outputText.append("\nRating: " + song1.getRating());
        outputText.append("\nPrice: $" + song1.getPrice());

        outputText.append("\n\nBooks:");
        Book book1 = new Book("\nHarry Potter and The Infinity Gauntlet", 1.29, 10);
        outputText.append(book1.getTitle());
        outputText.append("\nRating: " + book1.getRating());
        outputText.append("\nPrice: $" + book1.getPrice());

        outputText.append("\n\nMovies:");
        Movie movie1 = new Movie("\n\uD83C\uDD71eter Griffin and the Infinity Gauntlet", 10.00, 4);
        outputText.append(movie1.getTitle());
        outputText.append("\nRating: " + movie1.getRating());
        outputText.append("\nPrice: $" + movie1.getPrice());
    }
}
