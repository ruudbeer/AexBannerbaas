/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aexbanner.gso;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joel
 */
public class MockEffectenbeurs implements IEffectenbeurs{
    private List<IFonds> koersen;
    
    public MockEffectenbeurs() {
        koersen = new ArrayList<>();
        getKoersen();
    }

    
    
    @Override
    public List<IFonds> getKoersen() {
        for (int i = 0; i < 10; i++){
            Mock mock = new Mock("Koers "+i);
            koersen.add(mock);
        }
       return koersen;
    }
    
    
}
