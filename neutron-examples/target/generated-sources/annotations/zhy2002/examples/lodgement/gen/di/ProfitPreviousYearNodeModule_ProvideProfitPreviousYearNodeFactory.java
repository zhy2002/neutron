package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ProfitPreviousYearNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ProfitPreviousYearNodeModule_ProvideProfitPreviousYearNodeFactory
    implements Factory<ProfitPreviousYearNode> {
  private final ProfitPreviousYearNodeModule module;

  public ProfitPreviousYearNodeModule_ProvideProfitPreviousYearNodeFactory(
      ProfitPreviousYearNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ProfitPreviousYearNode get() {
    return Preconditions.checkNotNull(
        module.provideProfitPreviousYearNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ProfitPreviousYearNode> create(ProfitPreviousYearNodeModule module) {
    return new ProfitPreviousYearNodeModule_ProvideProfitPreviousYearNodeFactory(module);
  }

  /** Proxies {@link ProfitPreviousYearNodeModule#provideProfitPreviousYearNode()}. */
  public static ProfitPreviousYearNode proxyProvideProfitPreviousYearNode(
      ProfitPreviousYearNodeModule instance) {
    return instance.provideProfitPreviousYearNode();
  }
}
