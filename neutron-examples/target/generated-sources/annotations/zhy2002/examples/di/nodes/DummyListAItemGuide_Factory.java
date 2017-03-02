package zhy2002.examples.di.nodes;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DummyListAItemGuide_Factory implements Factory<DummyListAItemGuide> {
  private static final DummyListAItemGuide_Factory INSTANCE = new DummyListAItemGuide_Factory();

  @Override
  public DummyListAItemGuide get() {
    return new DummyListAItemGuide();
  }

  public static Factory<DummyListAItemGuide> create() {
    return INSTANCE;
  }
}
