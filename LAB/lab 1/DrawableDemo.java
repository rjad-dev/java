public class DrawableDemo {
    public static void main(String[] args) {
        Drawable[] drawables = {
                new Circle(),
                new Square()
        };

        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
