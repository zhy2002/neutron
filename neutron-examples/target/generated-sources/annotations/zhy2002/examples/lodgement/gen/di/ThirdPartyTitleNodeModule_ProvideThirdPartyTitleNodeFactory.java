package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyTitleNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyTitleNodeModule_ProvideThirdPartyTitleNodeFactory
    implements Factory<ThirdPartyTitleNode> {
  private final ThirdPartyTitleNodeModule module;

  public ThirdPartyTitleNodeModule_ProvideThirdPartyTitleNodeFactory(
      ThirdPartyTitleNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyTitleNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyTitleNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyTitleNode> create(ThirdPartyTitleNodeModule module) {
    return new ThirdPartyTitleNodeModule_ProvideThirdPartyTitleNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyTitleNodeModule#provideThirdPartyTitleNode()}. */
  public static ThirdPartyTitleNode proxyProvideThirdPartyTitleNode(
      ThirdPartyTitleNodeModule instance) {
    return instance.provideThirdPartyTitleNode();
  }
}
