package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OtherLiabilityListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final OtherLiabilityListNodeModule module;

  public OtherLiabilityListNodeModule_ProvideUiNodeFactory(OtherLiabilityListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(OtherLiabilityListNodeModule module) {
    return new OtherLiabilityListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link OtherLiabilityListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(OtherLiabilityListNodeModule instance) {
    return instance.provideUiNode();
  }
}
