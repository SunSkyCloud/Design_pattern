package Adapter;

public class AudioPlayer  implements  MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void paly(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Player mp3 file,Name"+fileName);
        }
        else  if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter=new MediaAdapter(audioType);
            mediaAdapter.paly(audioType,fileName);
        }else {
            System.out.println("Invalid  media"+audioType +"format not support");
        }
    }


}
