package org.example.pltw.medialib;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

public class MediaLibActivity extends ListActivity {
    private Song[] songs;
    private ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_lib);
        double totalCost = 0.0;
        double totalRating = 0;
        int numSongs = 0;
        double aveCost;
        double aveRating;
        Song song1 =  new Song("The Twist", 1.29, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song1.getPrice();
        totalRating = totalRating + song1.getRating();
        MediaFile.writeString(song1.getTitle() + "|" + song1.getRating());

        Song song2 =  new Song("Smooth", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song2.getPrice();
        totalRating = totalRating + song2.getRating();
        MediaFile.writeString(song2.getTitle() + "|" + song2.getRating());

        Song song3 =  new Song("Mack the Knife", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song3.getPrice();
        totalRating = totalRating + song3.getRating();
        MediaFile.writeString(song3.getTitle() + "|" + song3.getRating());

        Song song4 =  new Song("How Do I Live", 99, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song4.getPrice();
        totalRating = totalRating + song4.getRating();
        MediaFile.writeString(song4.getTitle() + "|" + song4.getRating());

        Song song5 =  new Song("Party Rock Anthem", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song5.getPrice();
        totalRating = totalRating + song5.getRating();
        MediaFile.writeString(song5.getTitle() + "|" + song5.getRating());

        Song song6 =  new Song("I Gotta Feeling", .99, 7);
        numSongs = numSongs + 1;
        totalCost = totalCost + song6.getPrice();
        totalRating = totalRating + song6.getRating();
        MediaFile.writeString(song6.getTitle() + "|" + song6.getRating());

        Song song7 =  new Song("Macaren", 1.29, 8);
        numSongs = numSongs + 1;
        totalCost = totalCost + song7.getPrice();
        totalRating = totalRating + song7.getRating();
        MediaFile.writeString(song7.getTitle() + "|" + song7.getRating());

        Song song8 =  new Song("Physical", .99, 6);
        numSongs = numSongs + 1;
        totalCost = totalCost + song8.getPrice();
        totalRating = totalRating + song8.getRating();
        MediaFile.writeString(song8.getTitle() + "|" + song8.getRating());

        Song song9 =  new Song("You Light Up My Life", 1.29, 10);
        numSongs = numSongs + 1;
        totalCost = totalCost + song9.getPrice();
        totalRating = totalRating + song9.getRating();
        MediaFile.writeString(song9.getTitle() + "|" + song9.getRating());

        Song song10 =  new Song("Hey Jude", .99, 9);
        numSongs = numSongs + 1;
        totalCost = totalCost + song10.getPrice();
        totalRating = totalRating + song10.getRating();
        MediaFile.writeString(song10.getTitle() + "|" + song10.getRating());

        MediaFile.saveAndClose();
        String[] songLibrary = new String[0];
//        for (int i = 0; i < numSongs; i++)
        for (Song s:songLibrary)
        {
            TextView outputText = TextView.setText(s.getTitle());
        }

    }
}
