package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessOtherDescriptionNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final AccessOtherDescriptionNodeModule module;

  public AccessOtherDescriptionNodeModule_ProvideUiNodeFactory(
      AccessOtherDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(AccessOtherDescriptionNodeModule module) {
    return new AccessOtherDescriptionNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link AccessOtherDescriptionNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(AccessOtherDescriptionNodeModule instance) {
    return instance.provideUiNode();
  }
}
