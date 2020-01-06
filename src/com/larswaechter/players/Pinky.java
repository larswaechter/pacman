package com.larswaechter.players;

import com.larswaechter.Utility;

/**
 * Pink ghost
 */

public class Pinky extends AbstractGhost {
    public Pinky() {
        super();
        this.setColor(Utility.colorGhostPink);
        this.setSpeed(2);
    }

    /**
     * Pinky positions itself in front of Pac-Man
     */
    public void move() {
    }
}
