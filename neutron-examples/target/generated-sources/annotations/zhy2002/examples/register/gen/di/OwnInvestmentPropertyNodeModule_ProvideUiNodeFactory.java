package zhy2002.examples.register.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OwnInvestmentPropertyNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OwnInvestmentPropertyNodeModule module;

  public OwnInvestmentPropertyNodeModule_ProvideUiNodeFactory(
      OwnInvestmentPropertyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OwnInvestmentPropertyNodeModule module) {
    return new OwnInvestmentPropertyNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OwnInvestmentPropertyNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OwnInvestmentPropertyNodeModule instance) {
    return instance.provideUiNode();
  }
}
