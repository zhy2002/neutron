package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.GrossYearlySalaryNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GrossYearlySalaryNodeModule_ProvideGrossYearlySalaryNodeFactory
    implements Factory<GrossYearlySalaryNode> {
  private final GrossYearlySalaryNodeModule module;

  public GrossYearlySalaryNodeModule_ProvideGrossYearlySalaryNodeFactory(
      GrossYearlySalaryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public GrossYearlySalaryNode get() {
    return Preconditions.checkNotNull(
        module.provideGrossYearlySalaryNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GrossYearlySalaryNode> create(GrossYearlySalaryNodeModule module) {
    return new GrossYearlySalaryNodeModule_ProvideGrossYearlySalaryNodeFactory(module);
  }

  /** Proxies {@link GrossYearlySalaryNodeModule#provideGrossYearlySalaryNode()}. */
  public static GrossYearlySalaryNode proxyProvideGrossYearlySalaryNode(
      GrossYearlySalaryNodeModule instance) {
    return instance.provideGrossYearlySalaryNode();
  }
}
