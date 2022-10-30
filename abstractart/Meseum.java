package abstractart;

public class Meseum {
	public static void main(String[] args) {
        Painting paint=new Painting();
        Sculpture sculpture =new Sculpture();
        paint.viewArt("Oil");
        paint.viewArt("Watercolor");
        paint.viewArt("Acrylic");
        sculpture.viewArt("Marble");
        sculpture.viewArt("Bronze");
        sculpture.viewArt("Porcelain");
    }
}


