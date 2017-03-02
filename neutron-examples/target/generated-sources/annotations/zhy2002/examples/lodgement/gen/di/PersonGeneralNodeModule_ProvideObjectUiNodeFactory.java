package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonGeneralNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PersonGeneralNodeModule module;

  public PersonGeneralNodeModule_ProvideObjectUiNodeFactory(PersonGeneralNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PersonGeneralNodeModule module) {
    return new PersonGeneralNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PersonGeneralNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PersonGeneralNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
