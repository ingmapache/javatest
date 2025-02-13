import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int idCounter = 0;
    private  int id = 0;
    //Available appointment list
    ArrayList<AvailableAppointment> availableAppointment = new ArrayList<>();
    private String name;
    private String email;
    private String specialty;

    Doctor(String name, String specialty) {
        System.out.println("El nombre del doctor asignado es: " + name);
        this.id = ++idCounter;
        this.name = name;
        this.specialty = specialty;
    }

    public void showName() {
        System.out.println(this.name);
    }

    public void showSpecialty() {
        System.out.println(this.specialty);
    }

    public void showId() {
        System.out.println("ID Doctor: " + this.id);
    }

    public void addAvailableAppointment(Date date, String time) {
        availableAppointment.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointment() {
        return availableAppointment;
    }

    public static class AvailableAppointment {
        private int id;
        private static int idCounter;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.id = ++idCounter;
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
