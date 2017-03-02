package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.TelephoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonHomePhoneNodeModule_ProvideTelephoneNodeFactory
    implements Factory<TelephoneNode<?>> {
  private final PersonHomePhoneNodeModule module;

  public PersonHomePhoneNodeModule_ProvideTelephoneNodeFactory(PersonHomePhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TelephoneNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideTelephoneNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TelephoneNode<?>> create(PersonHomePhoneNodeModule module) {
    return new PersonHomePhoneNodeModule_ProvideTelephoneNodeFactory(module);
  }

  /** Proxies {@link PersonHomePhoneNodeModule#provideTelephoneNode()}. */
  public static TelephoneNode<?> proxyProvideTelephoneNode(PersonHomePhoneNodeModule instance) {
    return instance.provideTelephoneNode();
  }
}
