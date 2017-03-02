package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyCompanyNameNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyCompanyNameNodeModule_ProvideThirdPartyCompanyNameNodeFactory
    implements Factory<ThirdPartyCompanyNameNode> {
  private final ThirdPartyCompanyNameNodeModule module;

  public ThirdPartyCompanyNameNodeModule_ProvideThirdPartyCompanyNameNodeFactory(
      ThirdPartyCompanyNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyCompanyNameNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyCompanyNameNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyCompanyNameNode> create(ThirdPartyCompanyNameNodeModule module) {
    return new ThirdPartyCompanyNameNodeModule_ProvideThirdPartyCompanyNameNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyCompanyNameNodeModule#provideThirdPartyCompanyNameNode()}. */
  public static ThirdPartyCompanyNameNode proxyProvideThirdPartyCompanyNameNode(
      ThirdPartyCompanyNameNodeModule instance) {
    return instance.provideThirdPartyCompanyNameNode();
  }
}
