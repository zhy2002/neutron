package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.HouseDutiesFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HouseDutiesFlagNodeModule_ProvideHouseDutiesFlagNodeFactory
    implements Factory<HouseDutiesFlagNode> {
  private final HouseDutiesFlagNodeModule module;

  public HouseDutiesFlagNodeModule_ProvideHouseDutiesFlagNodeFactory(
      HouseDutiesFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public HouseDutiesFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideHouseDutiesFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HouseDutiesFlagNode> create(HouseDutiesFlagNodeModule module) {
    return new HouseDutiesFlagNodeModule_ProvideHouseDutiesFlagNodeFactory(module);
  }

  /** Proxies {@link HouseDutiesFlagNodeModule#provideHouseDutiesFlagNode()}. */
  public static HouseDutiesFlagNode proxyProvideHouseDutiesFlagNode(
      HouseDutiesFlagNodeModule instance) {
    return instance.provideHouseDutiesFlagNode();
  }
}
