package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TrustIndustryNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final TrustIndustryNodeModule module;

  public TrustIndustryNodeModule_ProvideUiNodeFactory(TrustIndustryNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(TrustIndustryNodeModule module) {
    return new TrustIndustryNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link TrustIndustryNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(TrustIndustryNodeModule instance) {
    return instance.provideUiNode();
  }
}
