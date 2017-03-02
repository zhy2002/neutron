package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonTrustNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonTrustNodeModule_ProvidePersonTrustNodeFactory
    implements Factory<PersonTrustNode> {
  private final PersonTrustNodeModule module;

  public PersonTrustNodeModule_ProvidePersonTrustNodeFactory(PersonTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonTrustNode get() {
    return Preconditions.checkNotNull(
        module.providePersonTrustNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonTrustNode> create(PersonTrustNodeModule module) {
    return new PersonTrustNodeModule_ProvidePersonTrustNodeFactory(module);
  }

  /** Proxies {@link PersonTrustNodeModule#providePersonTrustNode()}. */
  public static PersonTrustNode proxyProvidePersonTrustNode(PersonTrustNodeModule instance) {
    return instance.providePersonTrustNode();
  }
}
