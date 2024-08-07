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

/**
 * This class represents the movement of the car
 */

public class MovementHandler implements Movable {

  private SegmentCurrent segmentCurrent;

  public MovementHandler(SegmentCurrent segmentCurrent) {
    this.segmentCurrent = segmentCurrent;
  }

  /**
   * @param direction the current direction of the car taken
   */
  @Override
  public void move(Direction direction) {
    switch (direction) {
      case UP:
        segmentCurrent.getY().setY(segmentCurrent.getY().getY() + 1);
        break;
      case DOWN:
        segmentCurrent.getY().setY(segmentCurrent.getY().getY() - 1);
        break;
      case LEFT:
        segmentCurrent.getX().setX(segmentCurrent.getX().getX() - 1);
        break;
      case RIGHT:
        segmentCurrent.getX().setX(segmentCurrent.getX().getX() + 1);
        break;
    }
  }
}
