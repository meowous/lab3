public class Human extends AHuman {

    Human(String name) {
        this.name = name;
    }

    public String saw(Human human) {
        return getName() + ", кто впервые увидел " + human.getName();
    }

    public String dontBelieved(Human human) {
        return ", ни за что не поверил бы, что перед ним " + human.getName();
    }

    public String lostWeight() {
        if (feel == Feelings.GREED) {
            return "худел " + getName() + " вовсе не от того, что ему нечего было кушать, а от собственной жадности.";
        } else {
            return "худел " + getName();
        }
    }

    public String spend(Objects objects) {
        return "Каждый раз, когда " + getName() + " приходилось истратить " + objects.getName();
    }

    public String toBeNervous() {
        return ", " + getName() + " так нервничал,";
    }

    public String torment() {
        if (feel == Feelings.GREED) {
            return " так теразался от жадности";
        } else {
            return "терзался";
        }
    }

    public String loseWeight() {
        return ", что терял в весе.";
    }

    public String gainWeight() {
        return ", но все равно не мог потолстеть, ";
    }

    public String compensate() {
        return "Чтобы возместить эти потери, ";
    }

    public String ate() {
        return getName() + " съедал ежедневно по четыре завтрака, по четыре обеда и четыре ужина";
    }

    public String hasSpent() {
        return " истратил на пищу слишком уж большую сумму денег.";
    }

    public String knew() {
        return getName() + " прекрасно знал";
    }

    public String cantDoSomething() {
        return " ничего поделать не мог.";
    }

    public String thinking(Objects objects) {
        return getName() + " почему-то забрал себе в голову, что его и без того " + objects.bigCapital();
    }
}
