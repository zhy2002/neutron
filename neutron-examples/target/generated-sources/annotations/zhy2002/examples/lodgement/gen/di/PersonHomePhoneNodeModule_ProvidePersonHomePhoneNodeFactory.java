package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonHomePhoneNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonHomePhoneNodeModule_ProvidePersonHomePhoneNodeFactory
    implements Factory<PersonHomePhoneNode> {
  private final PersonHomePhoneNodeModule module;

  public PersonHomePhoneNodeModule_ProvidePersonHomePhoneNodeFactory(
      PersonHomePhoneNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonHomePhoneNode get() {
    return Preconditions.checkNotNull(
        module.providePersonHomePhoneNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonHomePhoneNode> create(PersonHomePhoneNodeModule module) {
    return new PersonHomePhoneNodeModule_ProvidePersonHomePhoneNodeFactory(module);
  }

  /** Proxies {@link PersonHomePhoneNodeModule#providePersonHomePhoneNode()}. */
  public static PersonHomePhoneNode proxyProvidePersonHomePhoneNode(
      PersonHomePhoneNodeModule instance) {
    return instance.providePersonHomePhoneNode();
  }
}
