package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonContactNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonContactNodeModule_ProvidePersonContactNodeFactory
    implements Factory<PersonContactNode> {
  private final PersonContactNodeModule module;

  public PersonContactNodeModule_ProvidePersonContactNodeFactory(PersonContactNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonContactNode get() {
    return Preconditions.checkNotNull(
        module.providePersonContactNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonContactNode> create(PersonContactNodeModule module) {
    return new PersonContactNodeModule_ProvidePersonContactNodeFactory(module);
  }

  /** Proxies {@link PersonContactNodeModule#providePersonContactNode()}. */
  public static PersonContactNode proxyProvidePersonContactNode(PersonContactNodeModule instance) {
    return instance.providePersonContactNode();
  }
}
