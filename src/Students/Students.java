package Students;

public class Students {
    private int id;
    private String name;
    private int phone;
    private String country;
    private String classroom;

    public Students(int id, String name, int phone, String country, String classroom) {
        if (id > 0) {
            this.id = id;
        }
        this.name = name;
        if (phone > 0) {
            this.phone = phone;
        }
        this.country = country;
        this.classroom = classroom;
    }
    public Students() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        if (phone > 0) {
            this.phone = phone;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    @Override
    public String toString() {
        return   "-----------------------------------"
                + "\nMã sinh viên: " + this.getId()
                + "\nTên sinh viên: " + this.getName()
                + "\nSố điện thoại: " + this.getCountry()
                + "\nQuê quán: " + this.getCountry()
                + "\nLớp: " + this.getClassroom()
                + "\n-----------------------------";
    }
}
