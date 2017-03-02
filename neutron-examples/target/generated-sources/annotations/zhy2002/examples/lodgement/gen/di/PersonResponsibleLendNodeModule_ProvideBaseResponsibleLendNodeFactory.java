package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseResponsibleLendNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonResponsibleLendNodeModule_ProvideBaseResponsibleLendNodeFactory
    implements Factory<BaseResponsibleLendNode<?>> {
  private final PersonResponsibleLendNodeModule module;

  public PersonResponsibleLendNodeModule_ProvideBaseResponsibleLendNodeFactory(
      PersonResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseResponsibleLendNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseResponsibleLendNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseResponsibleLendNode<?>> create(PersonResponsibleLendNodeModule module) {
    return new PersonResponsibleLendNodeModule_ProvideBaseResponsibleLendNodeFactory(module);
  }

  /** Proxies {@link PersonResponsibleLendNodeModule#provideBaseResponsibleLendNode()}. */
  public static BaseResponsibleLendNode<?> proxyProvideBaseResponsibleLendNode(
      PersonResponsibleLendNodeModule instance) {
    return instance.provideBaseResponsibleLendNode();
  }
}
