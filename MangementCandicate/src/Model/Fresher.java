/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Fresher extends Candidate {
    private String dateOfGraduation;
    private String rank;

    public Fresher() {
        super();
    }

    public Fresher(String dateOfGraduation, String rank) {
        this.dateOfGraduation = dateOfGraduation;
        this.rank = rank;
    }

    public Fresher(String dateOfGraduation, String rank, String Id, String firstName, String lastName, int dob, String address, String phone, String mail, int type) {
        super(Id, firstName, lastName, dob, address, phone, mail, type);
        this.dateOfGraduation = dateOfGraduation;
        this.rank = rank;
    }

    public String getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(String dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    
}
