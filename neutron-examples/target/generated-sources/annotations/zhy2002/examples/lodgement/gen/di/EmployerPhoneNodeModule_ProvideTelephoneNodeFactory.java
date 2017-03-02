package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmployerPhoneNodeModule_ProvideTelephoneNodeFactory
    implements Factory<TelephoneNode<?>> {
  private final EmployerPhoneNodeModule module;

  public EmployerPhoneNodeModule_ProvideTelephoneNodeFactory(EmployerPhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TelephoneNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideTelephoneNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TelephoneNode<?>> create(EmployerPhoneNodeModule module) {
    return new EmployerPhoneNodeModule_ProvideTelephoneNodeFactory(module);
  }

  /** Proxies {@link EmployerPhoneNodeModule#provideTelephoneNode()}. */
  public static TelephoneNode<?> proxyProvideTelephoneNode(EmployerPhoneNodeModule instance) {
    return instance.provideTelephoneNode();
  }
}
