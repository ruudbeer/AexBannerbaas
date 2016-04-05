/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aexbanner.gso;

import java.util.Random;

/**
 *
 * @author Joel
 */
public class Mock implements IFonds{
    private String naam;
    private double koers;
    
    public Mock(String naam){
        this.naam = naam;
        RandomKoers();
    }
    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public double getKoers() {
        return koers;
    }
    public void RandomKoers(){
        Random random = new Random();
        koers = random.nextDouble();
    }
    
}
