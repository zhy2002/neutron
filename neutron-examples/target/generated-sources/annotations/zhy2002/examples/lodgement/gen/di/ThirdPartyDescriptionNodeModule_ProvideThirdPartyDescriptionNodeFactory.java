package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyDescriptionNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyDescriptionNodeModule_ProvideThirdPartyDescriptionNodeFactory
    implements Factory<ThirdPartyDescriptionNode> {
  private final ThirdPartyDescriptionNodeModule module;

  public ThirdPartyDescriptionNodeModule_ProvideThirdPartyDescriptionNodeFactory(
      ThirdPartyDescriptionNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyDescriptionNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyDescriptionNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyDescriptionNode> create(ThirdPartyDescriptionNodeModule module) {
    return new ThirdPartyDescriptionNodeModule_ProvideThirdPartyDescriptionNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyDescriptionNodeModule#provideThirdPartyDescriptionNode()}. */
  public static ThirdPartyDescriptionNode proxyProvideThirdPartyDescriptionNode(
      ThirdPartyDescriptionNodeModule instance) {
    return instance.provideThirdPartyDescriptionNode();
  }
}
