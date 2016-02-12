package org.mafagafogigante.dungeon.world;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 * The sky of a world.
 */
public class Sky implements Serializable {

  private final Collection<AstronomicalBody> astronomicalBodies = new ArrayList<>();

  /**
   * Constructs an empty sky.
   */
  Sky() {
  }

  public void addAstronomicalBody(AstronomicalBody astronomicalBody) {
    astronomicalBodies.add(astronomicalBody);
  }

  public String describeYourself() {
    StringBuilder stringBuilder = new StringBuilder();
    for (AstronomicalBody astronomicalBody : astronomicalBodies) {
      if (astronomicalBody.isVisible()) {
        if (stringBuilder.length() != 0) {
          stringBuilder.append(' ');
        }
        stringBuilder.append(astronomicalBody.describeYourself());
      }
    }
    return stringBuilder.toString();
  }

  @Override
  public String toString() {
    return describeYourself();
  }

}
