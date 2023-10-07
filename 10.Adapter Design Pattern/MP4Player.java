public class MP4Player implements AdvanceMediaPlayer{
    @Override
    public void PlayMP4(String name) {
        System.out.println("Playing mp4 file "+name);
    }

    @Override
    public void PlayVLC(String name) {
        System.out.println("Unsupported format");
    }
}
