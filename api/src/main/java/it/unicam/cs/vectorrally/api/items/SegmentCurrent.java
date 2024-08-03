/*
 * MIT License
 *
 * Copyright (c) 2024 Giuseppe Calabrese
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package it.unicam.cs.vectorrally.api.items;

import it.unicam.cs.vectorrally.api.environment.Point;
import java.awt.Color;
import java.util.Objects;

/**
 * This class represents the current segment of the game
 */

public class SegmentCurrent implements Segment {

  private Point x;
  private Point y;
  private double size;
  private Color color;

  public SegmentCurrent(Point x, Point y, double size, Color color) {
    this.x = x;
    this.y = y;
    this.size = size;
    this.color = color;
  }

  public Point getX() {
    return x;
  }

  public Point getY() {
    return y;
  }

  public double getSize() {
    return size;
  }

  public Color getColor() {
    return color;
  }

  @Override
  public Direction getDirection() {
    // TODO Complete this method
    return null;
  }

  @Override
  public boolean isConnectedTo(Segment segment) {
    if(Objects.requireNonNull(segment).equals(this)) {
      return false;
    }
    return this.x.equals(segment.getY()) || this.x.equals(segment.getY())
        || this.y.equals(segment.getX()) || this.y.equals(segment.getY());
  }
}
