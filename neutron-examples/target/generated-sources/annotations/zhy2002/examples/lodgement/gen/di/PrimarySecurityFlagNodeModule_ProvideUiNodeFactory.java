package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PrimarySecurityFlagNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final PrimarySecurityFlagNodeModule module;

  public PrimarySecurityFlagNodeModule_ProvideUiNodeFactory(PrimarySecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PrimarySecurityFlagNodeModule module) {
    return new PrimarySecurityFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PrimarySecurityFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PrimarySecurityFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
