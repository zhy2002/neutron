package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThirdPartyWorkPhoneNodeModule_ProvideTelephoneNodeFactory
    implements Factory<TelephoneNode<?>> {
  private final ThirdPartyWorkPhoneNodeModule module;

  public ThirdPartyWorkPhoneNodeModule_ProvideTelephoneNodeFactory(
      ThirdPartyWorkPhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TelephoneNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideTelephoneNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TelephoneNode<?>> create(ThirdPartyWorkPhoneNodeModule module) {
    return new ThirdPartyWorkPhoneNodeModule_ProvideTelephoneNodeFactory(module);
  }

  /** Proxies {@link ThirdPartyWorkPhoneNodeModule#provideTelephoneNode()}. */
  public static TelephoneNode<?> proxyProvideTelephoneNode(ThirdPartyWorkPhoneNodeModule instance) {
    return instance.provideTelephoneNode();
  }
}
