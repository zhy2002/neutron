package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityDescriptionNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final OtherLiabilityDescriptionNodeModule module;

  public OtherLiabilityDescriptionNodeModule_ProvideUiNodeFactory(
      OtherLiabilityDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityDescriptionNodeModule module) {
    return new OtherLiabilityDescriptionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityDescriptionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityDescriptionNodeModule instance) {
    return instance.provideUiNode();
  }
}
