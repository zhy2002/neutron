package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeModule_ProvideUiNodeFactory implements Factory<UiNode<?>> {
  private final PersonNodeModule module;

  public PersonNodeModule_ProvideUiNodeFactory(PersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PersonNodeModule module) {
    return new PersonNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PersonNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PersonNodeModule instance) {
    return instance.provideUiNode();
  }
}
