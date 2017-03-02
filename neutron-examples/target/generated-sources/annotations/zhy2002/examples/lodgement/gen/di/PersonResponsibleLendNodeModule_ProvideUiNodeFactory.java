package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonResponsibleLendNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final PersonResponsibleLendNodeModule module;

  public PersonResponsibleLendNodeModule_ProvideUiNodeFactory(
      PersonResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PersonResponsibleLendNodeModule module) {
    return new PersonResponsibleLendNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PersonResponsibleLendNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PersonResponsibleLendNodeModule instance) {
    return instance.provideUiNode();
  }
}
