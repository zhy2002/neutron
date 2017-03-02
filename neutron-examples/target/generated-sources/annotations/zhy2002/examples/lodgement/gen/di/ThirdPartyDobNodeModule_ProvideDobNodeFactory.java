package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.DobNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDobNodeModule_ProvideDobNodeFactory implements Factory<DobNode<?>> {
  private final ThirdPartyDobNodeModule module;

  public ThirdPartyDobNodeModule_ProvideDobNodeFactory(ThirdPartyDobNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public DobNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideDobNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DobNode<?>> create(ThirdPartyDobNodeModule module) {
    return new ThirdPartyDobNodeModule_ProvideDobNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDobNodeModule#provideDobNode()}. */
  public static DobNode<?> proxyProvideDobNode(ThirdPartyDobNodeModule instance) {
    return instance.provideDobNode();
  }
}
