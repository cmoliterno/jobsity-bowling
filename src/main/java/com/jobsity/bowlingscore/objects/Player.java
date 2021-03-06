package com.jobsity.bowlingscore.objects;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Screen> frames = new ArrayList<Screen>();
    
    public Player(String name){
        this.name = name;
    }
    
    public void throwBall(String pins){
        Screen frame = frames.stream()
                .filter(p -> p.getIndex() == frames.size()).findAny().orElse(null);
        
        if(frame == null || frame.isComplete()){
            Screen newFrame = new Screen(frames.size() + 1, pins);
            frames.add(newFrame);
        }else{
            frame.addBox(pins);
        }
    }
    
    public void printFrames(){
        System.out.print("Pintfalls");

        for (int i = 0; i < frames.size(); i++) {
            frames.get(i).printBoxes();
        }
        
        System.out.println();
        System.out.print("Score\t");
        for (int i = 0; i < frames.size(); i++) {
            frames.get(i).calculateTotal(frames);
            
            System.out.print("\t" + frames.get(i).getTotal());
        }
        System.out.println("\t" + frames.get(frames.size() -1).getTotal());
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
