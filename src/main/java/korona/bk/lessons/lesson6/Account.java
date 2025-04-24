package korona.bk.lessons.lesson6;

public interface Account {
    String cur();
    float sum();

    void transferAmountSent(String cur, float sum);
    void transferAmountReceived(String cur, float sum);

}
