package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTypeNodeModule_ProvideThirdPartyTypeNodeFactory
    implements Factory<ThirdPartyTypeNode> {
  private final ThirdPartyTypeNodeModule module;

  public ThirdPartyTypeNodeModule_ProvideThirdPartyTypeNodeFactory(
      ThirdPartyTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyTypeNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyTypeNode> create(ThirdPartyTypeNodeModule module) {
    return new ThirdPartyTypeNodeModule_ProvideThirdPartyTypeNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyTypeNodeModule#provideThirdPartyTypeNode()}. */
  public static ThirdPartyTypeNode proxyProvideThirdPartyTypeNode(
      ThirdPartyTypeNodeModule instance) {
    return instance.provideThirdPartyTypeNode();
  }
}
