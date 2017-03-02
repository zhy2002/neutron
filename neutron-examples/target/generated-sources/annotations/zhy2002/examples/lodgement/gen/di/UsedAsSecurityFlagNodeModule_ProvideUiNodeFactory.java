package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UsedAsSecurityFlagNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final UsedAsSecurityFlagNodeModule module;

  public UsedAsSecurityFlagNodeModule_ProvideUiNodeFactory(UsedAsSecurityFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(UsedAsSecurityFlagNodeModule module) {
    return new UsedAsSecurityFlagNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link UsedAsSecurityFlagNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(UsedAsSecurityFlagNodeModule instance) {
    return instance.provideUiNode();
  }
}
