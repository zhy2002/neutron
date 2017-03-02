package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.HousingStatusNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HousingStatusNodeModule_ProvideHousingStatusNodeFactory
    implements Factory<HousingStatusNode> {
  private final HousingStatusNodeModule module;

  public HousingStatusNodeModule_ProvideHousingStatusNodeFactory(HousingStatusNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public HousingStatusNode get() {
    return Preconditions.checkNotNull(
        module.provideHousingStatusNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<HousingStatusNode> create(HousingStatusNodeModule module) {
    return new HousingStatusNodeModule_ProvideHousingStatusNodeFactory(module);
  }

  /** Proxies {@link HousingStatusNodeModule#provideHousingStatusNode()}. */
  public static HousingStatusNode proxyProvideHousingStatusNode(HousingStatusNodeModule instance) {
    return instance.provideHousingStatusNode();
  }
}
