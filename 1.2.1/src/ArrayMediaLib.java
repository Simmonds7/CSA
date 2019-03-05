public class ArrayMediaLib
{
    static int total;

    public static void main(String args[])
    {/*
        String[] sharingFriends = { "Jamal",
                                    "Emily",
                                    "Destiny",
                                    "Mateo",
                                    "Sofia"
    };
    for (int i = 0; i < sharingFriends.length; i++)
    {
            System.out.println(sharingFriends[i]);
    }

    int[] daysBtwnPurchase = {2, 5, 1, 2, 4, 2, 1, 3};
    for (int item: daysBtwnPurchase)
    {
            total = daysBtwnPurchase[item] + total;

    }

    System.out.println(total/daysBtwnPurchase.length);
    */
    Song[] topTenSongs = {  new Song("The Twist"),
                            new Song("Smooth"),
                            new Song("Mack the Knife"),
                            new Song("How do I Live"),
                            new Song("Party Rock Anthem"),
                            new Song("I Gotta feeling"),
                            new Song("Macarena"),
                            new Song("Physical"),
                            new Song("You Light Up My Life"),
                            new Song("Hey Jude"),
                            new Song("Crab Rave")
    };
        // change the array
        System.out.println("-BEFORE--");
        for (Song changeSong : topTenSongs) {
            changeSong = new Song("test");
            System.out.println(changeSong.getTitle());
        }
// show the array
        System.out.println("-AFTER--");
        for (Song showSong : topTenSongs) {
            System.out.println(showSong.getTitle());
        }
    for (Song s: topTenSongs)
    {
            System.out.println(s.getTitle());
    }
    }

}
