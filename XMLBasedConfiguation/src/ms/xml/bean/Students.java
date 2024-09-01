package ms.xml.bean;

public class Students {
    private String name;
    private int roll_no;
    private String cllg_name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getCllg_name() {
        return cllg_name;
    }

    public void setCllg_name(String cllg_name) {
        this.cllg_name = cllg_name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", roll_no=" + roll_no +
                ", cllg_name='" + cllg_name + '\'' +
                '}';
    }
}
