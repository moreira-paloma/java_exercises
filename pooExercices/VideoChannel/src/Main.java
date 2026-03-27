public class Main {

        public static void main(String[] args) {

            Video video1 = new Video("Long Video", 1200);
            Video video2 = new Video("Short Viral Video", 98000);
            Channel channel = new Channel("Paloma Channel",video1);

            channel.publishVideo(video1);
            channel.publishVideo(video2);

            System.out.println("Total views: " + channel.getTotalViews());
        }
    }


