public class VideoMediaPlayer implements AdvancedMediaPlayer{

    @Override
    public void reproduzirVlc(String nomeDoArquivo) {
        System.out.printf("Reproduzindo VLC: " + nomeDoArquivo);
    }

    @Override
    public void reproduzirMp4(String nomeDoArquivo) {
        System.out.printf("Reproduzindo MP4: "+nomeDoArquivo);
    }
}
