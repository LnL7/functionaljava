package fj;

import static fj.Unit.unit;

public class E1Effects {


  /**
   * Returns a function for the given effect.
   *
   * @return The function using the given effect.
   */
  public static <A> F<A, Unit> e(final Effect<A> e) {
    return new F<A, Unit>() {
      public Unit f(final A a) {
        e.e(a);
        return unit();
      }
    };
  }

  /**
   * A contra-variant functor on effect.
   *
   * @param f The function to map over the effect.
   * @return An effect after a contra-variant map.
   */
  public final <A, B> Effect<B> comap(final Effect<A> e, final F<B, A> f) {
    return new Effect<B>() {
      public void e(final B b) {
        e.e(f.f(b));
      }
    };
  }

  public static <A> Effect<A> f(final F<A, Unit> f) {
    return new Effect<A>() {
      public void e(final A a) {
        f.f(a);
      }
    };
  }
}
