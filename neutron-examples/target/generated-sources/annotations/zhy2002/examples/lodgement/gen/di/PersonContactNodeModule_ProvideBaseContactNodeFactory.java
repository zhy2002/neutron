package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseContactNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonContactNodeModule_ProvideBaseContactNodeFactory
    implements Factory<BaseContactNode<?>> {
  private final PersonContactNodeModule module;

  public PersonContactNodeModule_ProvideBaseContactNodeFactory(PersonContactNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseContactNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseContactNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseContactNode<?>> create(PersonContactNodeModule module) {
    return new PersonContactNodeModule_ProvideBaseContactNodeFactory(module);
  }

  /** Proxies {@link PersonContactNodeModule#provideBaseContactNode()}. */
  public static BaseContactNode<?> proxyProvideBaseContactNode(PersonContactNodeModule instance) {
    return instance.provideBaseContactNode();
  }
}
