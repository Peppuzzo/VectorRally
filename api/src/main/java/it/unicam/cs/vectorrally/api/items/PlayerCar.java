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

import it.unicam.cs.vectorrally.api.environment.Position;
import it.unicam.cs.vectorrally.api.environment.Point;
import java.awt.Color;

/**
 * This class represents the player's car in the game
 */
public class PlayerCar extends BaseCar<Position, Color> {

  private Direction direction;

  /**
   * @param position the position of the car
   * @param color the color of the car
   */
  public PlayerCar(Position position, Color color) {
    super(position, color);
    this.direction = null;
  }

  @Override
  public Position getPosition() {
    // TODO Complete this method
    return null;
  }

  @Override
  public Point getX() {
    return null;
  }

  @Override
  public Point getY() {
    return null;
  }

  @Override
  public double getSize() {
    return 0;
  }

  @Override
  public Color getColor() {
    return this.color = color;
  }

  @Override
  public Direction getDirection() {
    return this.direction;
  }

  @Override
  public boolean isConnectedTo(Segment segment) {
    // TODO Complete this method
    return false;
  }

  /**
   * Move the car in the specified direction
   * @param direction the direction in which the car should move
   */
  @Override
  public void move(Direction direction) {
    // TODO Complete this method
  }
}
