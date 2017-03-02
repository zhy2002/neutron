package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonPrivacyNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PersonPrivacyNodeModule module;

  public PersonPrivacyNodeModule_ProvideObjectUiNodeFactory(PersonPrivacyNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PersonPrivacyNodeModule module) {
    return new PersonPrivacyNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PersonPrivacyNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PersonPrivacyNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
