package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonGeneralNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonGeneralNodeModule_ProvidePersonGeneralNodeFactory
    implements Factory<PersonGeneralNode> {
  private final PersonGeneralNodeModule module;

  public PersonGeneralNodeModule_ProvidePersonGeneralNodeFactory(PersonGeneralNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonGeneralNode get() {
    return Preconditions.checkNotNull(
        module.providePersonGeneralNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonGeneralNode> create(PersonGeneralNodeModule module) {
    return new PersonGeneralNodeModule_ProvidePersonGeneralNodeFactory(module);
  }

  /** Proxies {@link PersonGeneralNodeModule#providePersonGeneralNode()}. */
  public static PersonGeneralNode proxyProvidePersonGeneralNode(PersonGeneralNodeModule instance) {
    return instance.providePersonGeneralNode();
  }
}
