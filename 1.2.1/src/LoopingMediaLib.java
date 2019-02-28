public class LoopingMediaLib
{
    public static void main(String args[])
    {
        String songInfo = MediaFile.readString();


        while (songInfo != null)
        {
            String title = songInfo.substring(0, songInfo.indexOf("|"));
            String rating = songInfo.substring(songInfo.indexOf("|") + 1, songInfo.length());
            System.out.println();
            System.out.println("Song Title: " + title);
            System.out.println("Song Rating: " + rating);
            songInfo = MediaFile.readString();
        }
    }
}
