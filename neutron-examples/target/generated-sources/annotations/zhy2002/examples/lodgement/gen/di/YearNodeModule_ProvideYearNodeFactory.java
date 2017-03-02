package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.YearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class YearNodeModule_ProvideYearNodeFactory implements Factory<YearNode> {
  private final YearNodeModule module;

  public YearNodeModule_ProvideYearNodeFactory(YearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public YearNode get() {
    return Preconditions.checkNotNull(
        module.provideYearNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<YearNode> create(YearNodeModule module) {
    return new YearNodeModule_ProvideYearNodeFactory(module);
  }

  /** Proxies {@link YearNodeModule#provideYearNode()}. */
  public static YearNode proxyProvideYearNode(YearNodeModule instance) {
    return instance.provideYearNode();
  }
}
