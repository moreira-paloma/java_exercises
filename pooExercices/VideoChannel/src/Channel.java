public class Channel {

    private String nameChannel;
    private int totalViews;
    private Video video;

    public Channel(String nameChannel, Video video){
        this.nameChannel = nameChannel;
        this.totalViews = 0;
        this.video = video;

    }

    public void publishVideo(Video video){
        System.out.println("New video published." + video.getTitle());
        totalViews += video.getViews();
        }


    public int getTotalViews(){
        return totalViews;
    }
}
