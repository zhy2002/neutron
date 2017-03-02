package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.ThirdPartyWorkPhoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyWorkPhoneNodeModule_ProvideThirdPartyWorkPhoneNodeFactory
    implements Factory<ThirdPartyWorkPhoneNode> {
  private final ThirdPartyWorkPhoneNodeModule module;

  public ThirdPartyWorkPhoneNodeModule_ProvideThirdPartyWorkPhoneNodeFactory(
      ThirdPartyWorkPhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ThirdPartyWorkPhoneNode get() {
    return Preconditions.checkNotNull(
        module.provideThirdPartyWorkPhoneNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThirdPartyWorkPhoneNode> create(ThirdPartyWorkPhoneNodeModule module) {
    return new ThirdPartyWorkPhoneNodeModule_ProvideThirdPartyWorkPhoneNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyWorkPhoneNodeModule#provideThirdPartyWorkPhoneNode()}. */
  public static ThirdPartyWorkPhoneNode proxyProvideThirdPartyWorkPhoneNode(
      ThirdPartyWorkPhoneNodeModule instance) {
    return instance.provideThirdPartyWorkPhoneNode();
  }
}
