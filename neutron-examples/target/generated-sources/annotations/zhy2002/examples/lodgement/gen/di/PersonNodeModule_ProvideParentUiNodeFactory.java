package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonNodeModule_ProvideParentUiNodeFactory implements Factory<ParentUiNode<?>> {
  private final PersonNodeModule module;

  public PersonNodeModule_ProvideParentUiNodeFactory(PersonNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(PersonNodeModule module) {
    return new PersonNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link PersonNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(PersonNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
