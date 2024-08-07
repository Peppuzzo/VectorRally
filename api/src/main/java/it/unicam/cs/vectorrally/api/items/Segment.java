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

public interface Segment {

  /**
   * @return the x and y coordinates of the segment.
   */
  Point getX();

  Point getY();


    /**
     * Returns the length of the segment.
     *
     * @return the length of the segment.
     */
    double getSize();


    /**
     * Returns the color of the segment.
     *
     * @return the color of the segment.
     */
    Color getColor();


    /**
     * Returns the direction of the segment.
     *
     * @return the direction of the segment.
     */
    Direction getDirection();


    /**
     * Returns true if the segment is connected to the given segment.
     *
     * @param segment the segment to check.
     * @return true if the segment is connected to the given segment.
     */
    public boolean isConnectedTo(Segment segment);

}
