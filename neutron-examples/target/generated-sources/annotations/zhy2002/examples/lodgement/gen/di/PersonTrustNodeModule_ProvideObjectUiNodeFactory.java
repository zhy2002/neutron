package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonTrustNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PersonTrustNodeModule module;

  public PersonTrustNodeModule_ProvideObjectUiNodeFactory(PersonTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PersonTrustNodeModule module) {
    return new PersonTrustNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PersonTrustNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PersonTrustNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
