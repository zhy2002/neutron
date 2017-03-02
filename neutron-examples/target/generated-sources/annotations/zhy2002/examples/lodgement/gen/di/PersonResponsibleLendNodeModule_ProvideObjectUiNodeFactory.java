package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonResponsibleLendNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final PersonResponsibleLendNodeModule module;

  public PersonResponsibleLendNodeModule_ProvideObjectUiNodeFactory(
      PersonResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(PersonResponsibleLendNodeModule module) {
    return new PersonResponsibleLendNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link PersonResponsibleLendNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(PersonResponsibleLendNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
