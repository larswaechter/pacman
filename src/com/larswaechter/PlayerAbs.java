package com.larswaechter;

import processing.core.PApplet;
import processing.core.PGraphics;

import java.awt.*;

abstract class PlayerAbs extends PApplet {
    float frameCounter = 0;

    // Higher value = slower speed
    float speed = 5;

    int color;

    Block currentBlock;

    private float x;
    private float y;

    private float radius = 15;

    PlayerAbs() {
    }

    PlayerAbs(Block spawnBlock) {
        this.setCurrentBlock(spawnBlock);
        this.getCurrentBlock().removeItem();
        Point blockCenter = this.getCurrentBlock().getCenter();
        this.x = blockCenter.x;
        this.y = blockCenter.y;
    }

    /**
     * Draw player
     *
     * @param g Processing graphic
     */
    void draw(PGraphics g) {
        g.fill(this.color);
        g.ellipse(this.x, this.y, this.radius * 2, this.radius * 2);
    }

    /**
     * Move player to given block
     *
     * @param block Block to move to
     */
    void moveToBlock(Block block) {
        this.setCurrentBlock(block);

        Point blockCenter = block.getCenter();
        this.x = blockCenter.x;
        this.y = blockCenter.y;
    }

    /**
     * Get current block player is positioned on
     *
     * @return Block
     */
    Block getCurrentBlock() {
        return currentBlock;
    }

    /**
     * Set current block player is positioned on
     *
     * @param currentBlock Block
     */
    void setCurrentBlock(Block currentBlock) {
        this.currentBlock = currentBlock;
    }
}
