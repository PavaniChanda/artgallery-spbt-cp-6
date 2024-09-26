package com.example.artgallery.repository;

import com.example.artgallery.model.*;
import java.util.ArrayList;
import java.util.List;

public interface ArtRepository {

    ArrayList<Art> getArts();

    Art getArtById(int artId);

    Art addArt(Art art);

    Art updateArt(int ArtId, Art art);

    void deleteArt(int artId);

    Artist getArtArtist(int artId);

}

/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */

// Write your code here