package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyDobNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDobNodeModule_ProvideThirdPartyDobNodeFactory
    implements Factory<ThirdPartyDobNode> {
  private final ThirdPartyDobNodeModule module;

  public ThirdPartyDobNodeModule_ProvideThirdPartyDobNodeFactory(ThirdPartyDobNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyDobNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyDobNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyDobNode> create(ThirdPartyDobNodeModule module) {
    return new ThirdPartyDobNodeModule_ProvideThirdPartyDobNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDobNodeModule#provideThirdPartyDobNode()}. */
  public static ThirdPartyDobNode proxyProvideThirdPartyDobNode(ThirdPartyDobNodeModule instance) {
    return instance.provideThirdPartyDobNode();
  }
}
