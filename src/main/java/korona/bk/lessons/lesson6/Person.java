package korona.bk.lessons.lesson6;

public class Person implements Account {
    private final String name;
    private String cur;
    private float sum;

    public Person(String name) {
        this.name = name;
    }


    public String getCur() {
        return cur;
    }

    public void setCur(String cur) {
        this.cur = cur;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    @Override
    public String cur() {
        return cur;
    }

    @Override
    public float sum() {
        return sum;
    }

    @Override
    public void transferAmountSent(String cur, float sum) {
        this.cur = cur;
        this.sum = this.sum - sum;


    }

    @Override
    public void transferAmountReceived(String cur, float sum) {
        if (this.cur == cur) {
            this.sum = this.sum + sum;
        }
    }
}
