package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonPrivacyNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonPrivacyNodeModule_ProvidePersonPrivacyNodeFactory
    implements Factory<PersonPrivacyNode> {
  private final PersonPrivacyNodeModule module;

  public PersonPrivacyNodeModule_ProvidePersonPrivacyNodeFactory(PersonPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonPrivacyNode get() {
    return Preconditions.checkNotNull(
        module.providePersonPrivacyNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonPrivacyNode> create(PersonPrivacyNodeModule module) {
    return new PersonPrivacyNodeModule_ProvidePersonPrivacyNodeFactory(module);
  }

  /** Proxies {@link PersonPrivacyNodeModule#providePersonPrivacyNode()}. */
  public static PersonPrivacyNode proxyProvidePersonPrivacyNode(PersonPrivacyNodeModule instance) {
    return instance.providePersonPrivacyNode();
  }
}
