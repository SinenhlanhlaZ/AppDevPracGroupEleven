package za.ac.cput.factory;

public class DoctorFactory {
    public DoctorNames getDoctorFirstName(String docFirstName) {
        if(docFirstName == null) {
            return null;
        }
        if(docFirstName.equals("Sine")) {
            return new Doctor();
        }

        return null;
    }
}
