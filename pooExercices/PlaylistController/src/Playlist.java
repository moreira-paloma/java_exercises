import java.util.ArrayList;

public class Playlist {

    private String playlistName;
    private ArrayList<Video> videoList;

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
        this.videoList = new ArrayList<>();
    }

    public void addVideo(Video video){
        videoList.add(video);

    }

    public void searchVideoByTitle(String title){
        for(Video video : videoList){
            if(video.getTitle().equalsIgnoreCase(title)){
                System.out.println("O vídeo " + video.getTitle() + " já está na playlist. ");
                return;
            }
        }
        System.out.println("Vídeo não encontrado.");
    }

    public String getPlaylistName() {
        return playlistName;
    }

    public ArrayList<Video> getVideoList() {
        return videoList;
    }
}
