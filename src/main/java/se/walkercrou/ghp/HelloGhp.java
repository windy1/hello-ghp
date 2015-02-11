package se.walkercrou.ghp;

/**
 * An example project demonstrating the GitHub Pages Maven Plugin.
 */
public class HelloGhp {
    /**
     * Field description
     */
    public static int EXAMPLE_FIELD = 0;

    private final int foo, bar;

    /**
     * Constructor description
     *
     * @param foo foo parameter description
     * @param bar bar parameter description
     */
    public HelloGhp(int foo, int bar) {
        this.foo = foo;
        this.bar = bar;
    }

    /**
     * Returns foo.
     *
     * @return foo
     */
    public int getFoo() {
        return foo;
    }

    /**
     * Returns bar.
     *
     * @return bar
     */
    public int getBar() {
        return bar;
    }
}
