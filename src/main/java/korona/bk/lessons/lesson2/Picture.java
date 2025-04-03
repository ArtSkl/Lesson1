package korona.bk.lessons.lesson2;

public class Picture {

    private String image;
    private Figure form;

    public Picture(String image, Figure form) {
        this.image = image;
        this.form = form;
    }

    public void  print(){

        System.out.println(image);
        System.out.println(form.print());
    }
}
