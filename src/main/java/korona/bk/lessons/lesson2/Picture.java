package korona.bk.lessons.lesson2;

public class Picture {

    private final String image;
    private final FigureInterface form;

    public Picture(String image, FigureInterface form) {
        this.image = image;
        this.form = form;
    }

    public void  print(){
        System.out.println(image);
        System.out.println(form.print());
    }
}
