public class MediaAdapter implements MediaPlayer{

    AdvanceMediaPlayer advanceMusicPlayer;

    public MediaAdapter(String audioType) {
       if(audioType.equalsIgnoreCase("vlc"))
       {
           advanceMusicPlayer = new VLCPlayer();
       } else if (audioType.equalsIgnoreCase("mp4")) {
           advanceMusicPlayer = new MP4Player();
       }
    }

    @Override
    public void Play(String format, String name) {
        if(format.equalsIgnoreCase("vlc"))
        {
            advanceMusicPlayer.PlayVLC(name);
        } else if (format.equalsIgnoreCase("mp4")) {
            advanceMusicPlayer.PlayMP4(name);
        }
    }
}
