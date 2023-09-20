/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import Model.Candidate;
import Model.Experience;
import Model.Fresher;
import Model.Intership;
import View.Validation;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Asus
 */
public class CandidateCommon {

    public static void creatCandidate(ArrayList<Candidate> candidateS, int type) {
        while (true) {
            System.out.println("Enter id");
            String id = Validation.checkInputString();

            System.out.print("Enter first name: ");
            String firstName = Validation.checkInputString();
            System.out.print("Enter last name: ");
            String lastName = Validation.checkInputString();
            System.out.print("Enter birth date: ");
            int dob = Validation.checkInputIntLimit(1900, Calendar.getInstance().get(Calendar.YEAR));
            System.out.print("Enter address: ");
            String address = Validation.checkInputString();
            System.out.print("Enter phone: ");
            String phone = Validation.checkInputPhone();
            System.out.print("Enter email: ");
            String mail = Validation.checkInputEmail();
            Candidate x = new Candidate(id, firstName, lastName,
                    dob, address, phone, mail, type);
            if (Validation.checkIdExist(candidateS, id)) {
                switch (type) {
                    case 0:
                        createExperience(candidateS, x);
                        break;
                    case 1:
                        createFresher(candidateS, x);
                        break;
                    case 2:
                        createInternship(candidateS, x);
                        break;
                }
            } else {
                return;
            }
            System.out.print("Do you want to continue (Y/N): ");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public static void createExperience(ArrayList<Candidate> candidateS, Candidate candidate) {
        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkInputExprience(candidate.getDob());
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validation.checkInputString();
        candidateS.add(new Experience(yearExperience, professionalSkill,
                candidate.getId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getDob(), candidate.getAddress(),
                candidate.getPhone(), candidate.getMail(), candidate.getType()));
        System.err.println("Create successfully.");
    }

    public static void createFresher(ArrayList<Candidate> candidateS, Candidate candidate) {
        System.out.print("Enter graduation date: ");
        String graduationDate = Validation.checkInputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = Validation.checkInputGraduationRank();
        candidateS.add(new Fresher(graduationDate, graduationRank, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getDob(), candidate.getAddress(),
                candidate.getPhone(), candidate.getMail(),
                candidate.getType()));
        System.err.println("Create successfully.");
    }

    public static void createInternship(ArrayList<Candidate> candidateS, Candidate candidate) {
        System.out.print("Enter major: ");
        String major = Validation.checkInputString();
        System.out.print("Enter semester: ");
        String semester = Validation.checkInputString();
        System.out.print("Enter university: ");
        String university = Validation.checkInputString();
        candidateS.add(new Intership(major, semester, university, candidate.getId(),
                candidate.getFirstName(), candidate.getLastName(),
                candidate.getDob(), candidate.getAddress(),
                candidate.getPhone(), candidate.getMail(),
                candidate.getType()));
        System.err.println("Create successfully.");
    }

    public static void searchCandidate(ArrayList<Candidate> candidateS) {
        printListNameCandidate(candidateS);
        System.out.print("Enter andidate name (First name or Last name): ");
        String nameSearch = Validation.checkInputString();
        System.out.print("Enter type of candidate: ");
        int typeCandidate = Validation.checkInputIntLimit(0, 2);
        for (Candidate candidate : candidateS) {
            if (candidate.getType() == typeCandidate && (candidate.getFirstName().contains(nameSearch) || candidate.getLastName().contains(nameSearch))) {
                System.out.println(candidate.toString());
            }
        }
    }

    public static void printListNameCandidate(ArrayList<Candidate> candidateS) {
        System.err.println("===========Experience Candidate===========");
        for (Candidate candidate : candidateS) {
            if (candidate.getType() == 0) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.err.println("===========Fresher Candidate==========");
        for (Candidate candidate : candidateS) {
            if (candidate.getType() == 1) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
        System.err.println("===========Internship Candidate==========");
        for (Candidate candidate : candidateS) {
            if (candidate.getType() == 2) {
                System.out.println(candidate.getFirstName() + " " + candidate.getLastName());
            }
        }
    }

}
