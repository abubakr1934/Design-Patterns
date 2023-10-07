public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;
    @Override
    public void Play(String format, String name) {
        if (format.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file: "+ name);
        } else if (format.equalsIgnoreCase("vlc")||format.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(format);
            mediaAdapter.Play(format,name);
        }
        else {
            System.out.println("Unsupported format");
        }
    }
}
