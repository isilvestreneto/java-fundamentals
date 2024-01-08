package tech.learning.streams;

public class MediaTest {
    public static void main(String[] args) {
        Media media1 = new Media()
                .adicionar(10)
                .adicionar(8)
                .adicionar(6);
        Media media2 = new Media()
                .adicionar(5)
                .adicionar(6);

        System.out.println(media1.getMedia());
        System.out.println(media2.getMedia());

        System.out.println(Media.combinar(media1, media2).getMedia());
    }
}
