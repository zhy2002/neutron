package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityTypeNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final OtherLiabilityTypeNodeModule module;

  public OtherLiabilityTypeNodeModule_ProvideUiNodeFactory(OtherLiabilityTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityTypeNodeModule module) {
    return new OtherLiabilityTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
