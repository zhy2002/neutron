package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyDisclosureFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDisclosureFlagNodeModule_ProvideThirdPartyDisclosureFlagNodeFactory
    implements Factory<ThirdPartyDisclosureFlagNode> {
  private final ThirdPartyDisclosureFlagNodeModule module;

  public ThirdPartyDisclosureFlagNodeModule_ProvideThirdPartyDisclosureFlagNodeFactory(
      ThirdPartyDisclosureFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyDisclosureFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyDisclosureFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyDisclosureFlagNode> create(
      ThirdPartyDisclosureFlagNodeModule module) {
    return new ThirdPartyDisclosureFlagNodeModule_ProvideThirdPartyDisclosureFlagNodeFactory(
        module);
  }

  /** Proxies {@link ThirdPartyDisclosureFlagNodeModule#provideThirdPartyDisclosureFlagNode()}. */
  public static ThirdPartyDisclosureFlagNode proxyProvideThirdPartyDisclosureFlagNode(
      ThirdPartyDisclosureFlagNodeModule instance) {
    return instance.provideThirdPartyDisclosureFlagNode();
  }
}
