package za.ac.cput.repository;

/*
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Doctor;
import za.ac.cput.entities.Secretary;

import javax.print.Doc;
import java.util.ArrayList;

public class DoctorRepository {
    private static DoctorRepository docRep = null;
    private ArrayList<Doctor> doctorArrayList = null;

    private DoctorRepository()
    {
        doctorArrayList = new ArrayList<Doctor>();
    }

    public static DoctorRepository getRepository()
    {
        if(docRep == null)
        {
            docRep = new DoctorRepository();
        }
        return docRep;
    }

    public Doctor create(Doctor docObj)
    {
        boolean success = doctorArrayList.add(docObj);
        if(!success)
        {
            return null;
        }
        return docObj;
    }

    public Doctor read(String docID) {
        for(Doctor d : doctorArrayList)
        {
            if(d.getDocID().equals(docID))
            {
                return d;
            }
        }
        return null;
    }

    public Doctor update(Doctor doc)
    {
        Doctor d = read(doc.getDocID());
        if( d != null)
        {
            doctorArrayList.remove(d);
            doctorArrayList.add(doc);
            return doc;
        }
        return null;
    }

    public boolean delete(String docID)
    {
        Doctor doctorToBeDeleted = read(docID);
        if(doctorToBeDeleted == null)
        {
            return false;
        }
        doctorArrayList.remove(doctorToBeDeleted);
        return true;
    }

    public ArrayList<Doctor> getDoctors()
    {
        return doctorArrayList;
    }
}
