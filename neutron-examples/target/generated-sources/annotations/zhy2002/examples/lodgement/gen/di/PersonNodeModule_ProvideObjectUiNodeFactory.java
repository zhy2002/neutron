package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeModule_ProvideObjectUiNodeFactory implements Factory<ObjectUiNode<?>> {
  private final PersonNodeModule module;

  public PersonNodeModule_ProvideObjectUiNodeFactory(PersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PersonNodeModule module) {
    return new PersonNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PersonNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PersonNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
