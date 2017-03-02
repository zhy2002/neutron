package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyEmailNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyEmailNodeModule_ProvideThirdPartyEmailNodeFactory
    implements Factory<ThirdPartyEmailNode> {
  private final ThirdPartyEmailNodeModule module;

  public ThirdPartyEmailNodeModule_ProvideThirdPartyEmailNodeFactory(
      ThirdPartyEmailNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyEmailNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyEmailNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyEmailNode> create(ThirdPartyEmailNodeModule module) {
    return new ThirdPartyEmailNodeModule_ProvideThirdPartyEmailNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyEmailNodeModule#provideThirdPartyEmailNode()}. */
  public static ThirdPartyEmailNode proxyProvideThirdPartyEmailNode(
      ThirdPartyEmailNodeModule instance) {
    return instance.provideThirdPartyEmailNode();
  }
}
