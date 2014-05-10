package fj;

import static fj.Unit.unit;

/**
 * Represents a side-effect.
 *
 * @version %build.number%
 */
public interface Effect<A> {
  /**
   * Execute effect with <code>A</code>.
   *
   * @param a The <code>A</code> to execute the effect with.
   */
  public abstract void e(A a);
}
