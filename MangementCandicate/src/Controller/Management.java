/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Common.CandidateCommon;
import Model.Candidate;
import View.Menu;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Management extends Menu {
    
    private static ArrayList<Candidate> arr = new ArrayList();

    public Management() {
    }

    public Management(String title, String[] s) {
        super(title, s);
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                CandidateCommon.creatCandidate(arr, 0);
                break;
            case 2:
                CandidateCommon.creatCandidate(arr, 1);
                break;
            case 3:
                CandidateCommon.creatCandidate(arr, 2);
                break;
            case 4:
                CandidateCommon.searchCandidate(arr);
                break;
            case 5: 
                System.out.println("Exited");
                return;
            default:
                System.err.println("Choose 1-5");
        }
    } 
}