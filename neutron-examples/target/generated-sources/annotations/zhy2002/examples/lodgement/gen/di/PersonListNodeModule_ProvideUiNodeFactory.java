package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonListNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PersonListNodeModule module;

  public PersonListNodeModule_ProvideUiNodeFactory(PersonListNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PersonListNodeModule module) {
    return new PersonListNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PersonListNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PersonListNodeModule instance) {
    return instance.provideUiNode();
  }
}
