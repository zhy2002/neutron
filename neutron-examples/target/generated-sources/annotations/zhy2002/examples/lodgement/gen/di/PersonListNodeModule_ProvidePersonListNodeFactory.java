package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonListNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonListNodeModule_ProvidePersonListNodeFactory
    implements Factory<PersonListNode> {
  private final PersonListNodeModule module;

  public PersonListNodeModule_ProvidePersonListNodeFactory(PersonListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonListNode get() {
    return Preconditions.checkNotNull(
        module.providePersonListNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonListNode> create(PersonListNodeModule module) {
    return new PersonListNodeModule_ProvidePersonListNodeFactory(module);
  }

  /** Proxies {@link PersonListNodeModule#providePersonListNode()}. */
  public static PersonListNode proxyProvidePersonListNode(PersonListNodeModule instance) {
    return instance.providePersonListNode();
  }
}
