/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Asus
 */
public class Experience extends Candidate{
    private int year;
    private String skill;

    public Experience() {
        super();
    }

    public Experience(int year, String skill) {
        this.year = year;
        this.skill = skill;
    }

    public Experience(int year, String skill, String Id, String firstName, String lastName, int dob, String address, String phone, String mail, int type) {
        super(Id, firstName, lastName, dob, address, phone, mail, type);
        this.year = year;
        this.skill = skill;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
    
}
