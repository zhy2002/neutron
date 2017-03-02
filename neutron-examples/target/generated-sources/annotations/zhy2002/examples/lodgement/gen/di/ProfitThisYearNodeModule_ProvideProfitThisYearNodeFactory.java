package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProfitThisYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitThisYearNodeModule_ProvideProfitThisYearNodeFactory
    implements Factory<ProfitThisYearNode> {
  private final ProfitThisYearNodeModule module;

  public ProfitThisYearNodeModule_ProvideProfitThisYearNodeFactory(
      ProfitThisYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProfitThisYearNode get() {
    return Preconditions.checkNotNull(
        module.provideProfitThisYearNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProfitThisYearNode> create(ProfitThisYearNodeModule module) {
    return new ProfitThisYearNodeModule_ProvideProfitThisYearNodeFactory(module);
  }

  /** Proxies {@link ProfitThisYearNodeModule#provideProfitThisYearNode()}. */
  public static ProfitThisYearNode proxyProvideProfitThisYearNode(
      ProfitThisYearNodeModule instance) {
    return instance.provideProfitThisYearNode();
  }
}
