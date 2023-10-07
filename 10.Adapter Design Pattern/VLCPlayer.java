public class VLCPlayer implements AdvanceMediaPlayer{

    @Override
    public void PlayMP4(String name) {
        System.out.println("Unsupported format");
    }

    @Override
    public void PlayVLC(String name) {
        System.out.println("Playing VLC file "+name);
    }
}
