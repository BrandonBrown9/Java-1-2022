// Brandon Brown
// 3/18/22
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paula
 */

 // Step 2 : Extend/Inherit Product superclass class
public class Album extends Product {
    
    private String artist;

    public Album() { 
        super();
        artist = "";
        count++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() { 
        return artist; 
    }

    // Overide the default Product constructor and toString() method
    @Override
    public String toString() {
        return super.toString() + " (" + artist + ")";
    }


}
