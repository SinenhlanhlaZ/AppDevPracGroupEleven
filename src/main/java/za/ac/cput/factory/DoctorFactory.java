package za.ac.cput.factory;

/*
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Doctor;
import za.ac.cput.entities.Secretary;
import za.ac.cput.util.Helper;

public class DoctorFactory {
    public static Doctor createDoctor(String doctorFirstName, String doctorLastName,
                                      String docCellNum)
    {
        String docID = Helper.generateID();

        if(Helper.isNullorEmpty(doctorFirstName) || Helper.isNullorEmpty(doctorLastName) ||
        Helper.isNullorEmpty(docCellNum))
        {
            return null;
        }
        return new Doctor.DoctorBuilder().setDocID(docID).setDocFirstName(doctorFirstName)
                .setDocLastName(doctorLastName).setDocCellNum(docCellNum).build();
    }
}
