public class FavoritesMediaLib
{
    public static void main(String args[])
    {
        String songInfo = MediaFile.readString();

        System.out.println("My Favorite Songs in Order of Rating");
        System.out.println("------------------------------------");

        int index = songInfo.indexOf("|");
        while (index > 0)
        {
            String titleSong = songInfo.substring(0, index);
            songInfo = songInfo.substring(index + 1);
            index = songInfo.indexOf("|");
            String ratingString = songInfo.substring(index + 1, songInfo.length());

            int rating = Integer.valueOf(ratingString);
            if (rating > 7)
            {
                System.out.println("Song Title: " + titleSong +" Song Rating: " + ratingString);
                System.out.println();
            }
            songInfo = songInfo.substring(index + 1);

            index = songInfo.indexOf("|");
        }
    }
}
