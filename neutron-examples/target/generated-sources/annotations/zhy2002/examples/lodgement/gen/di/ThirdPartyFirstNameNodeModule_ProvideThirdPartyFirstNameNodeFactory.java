package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyFirstNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyFirstNameNodeModule_ProvideThirdPartyFirstNameNodeFactory
    implements Factory<ThirdPartyFirstNameNode> {
  private final ThirdPartyFirstNameNodeModule module;

  public ThirdPartyFirstNameNodeModule_ProvideThirdPartyFirstNameNodeFactory(
      ThirdPartyFirstNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyFirstNameNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyFirstNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyFirstNameNode> create(ThirdPartyFirstNameNodeModule module) {
    return new ThirdPartyFirstNameNodeModule_ProvideThirdPartyFirstNameNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyFirstNameNodeModule#provideThirdPartyFirstNameNode()}. */
  public static ThirdPartyFirstNameNode proxyProvideThirdPartyFirstNameNode(
      ThirdPartyFirstNameNodeModule instance) {
    return instance.provideThirdPartyFirstNameNode();
  }
}
