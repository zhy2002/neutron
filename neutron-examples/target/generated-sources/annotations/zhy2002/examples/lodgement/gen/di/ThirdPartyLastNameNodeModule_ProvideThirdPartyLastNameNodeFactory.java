package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyLastNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyLastNameNodeModule_ProvideThirdPartyLastNameNodeFactory
    implements Factory<ThirdPartyLastNameNode> {
  private final ThirdPartyLastNameNodeModule module;

  public ThirdPartyLastNameNodeModule_ProvideThirdPartyLastNameNodeFactory(
      ThirdPartyLastNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyLastNameNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyLastNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyLastNameNode> create(ThirdPartyLastNameNodeModule module) {
    return new ThirdPartyLastNameNodeModule_ProvideThirdPartyLastNameNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyLastNameNodeModule#provideThirdPartyLastNameNode()}. */
  public static ThirdPartyLastNameNode proxyProvideThirdPartyLastNameNode(
      ThirdPartyLastNameNodeModule instance) {
    return instance.provideThirdPartyLastNameNode();
  }
}
