package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeModule_ProvidePersonNodeFactory implements Factory<PersonNode> {
  private final PersonNodeModule module;

  public PersonNodeModule_ProvidePersonNodeFactory(PersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonNode get() {
    return Preconditions.checkNotNull(
        module.providePersonNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonNode> create(PersonNodeModule module) {
    return new PersonNodeModule_ProvidePersonNodeFactory(module);
  }

  /** Proxies {@link PersonNodeModule#providePersonNode()}. */
  public static PersonNode proxyProvidePersonNode(PersonNodeModule instance) {
    return instance.providePersonNode();
  }
}
