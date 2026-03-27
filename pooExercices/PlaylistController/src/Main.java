public class Main {
    public static void main(String[] args) {


                Playlist playlist = new Playlist("Programando por dia");

                Video v1 = new Video("Aprendendo Java", 300);
                Video v2 = new Video("POO na prática", 420);
                Video v3 = new Video("Estruturas de Dados", 280);

                playlist.addVideo(v1);
                playlist.addVideo(v2);
                playlist.addVideo(v3);

                playlist.searchVideoByTitle("POO na prática");
                playlist.searchVideoByTitle("Python básico");
            }
        }

