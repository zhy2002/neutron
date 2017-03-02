package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LiabilitiesNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final LiabilitiesNodeModule module;

  public LiabilitiesNodeModule_ProvideUiNodeFactory(LiabilitiesNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(LiabilitiesNodeModule module) {
    return new LiabilitiesNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link LiabilitiesNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(LiabilitiesNodeModule instance) {
    return instance.provideUiNode();
  }
}
