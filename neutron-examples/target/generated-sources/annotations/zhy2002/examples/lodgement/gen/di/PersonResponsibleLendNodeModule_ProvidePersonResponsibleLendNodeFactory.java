package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonResponsibleLendNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonResponsibleLendNodeModule_ProvidePersonResponsibleLendNodeFactory
    implements Factory<PersonResponsibleLendNode> {
  private final PersonResponsibleLendNodeModule module;

  public PersonResponsibleLendNodeModule_ProvidePersonResponsibleLendNodeFactory(
      PersonResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonResponsibleLendNode get() {
    return Preconditions.checkNotNull(
        module.providePersonResponsibleLendNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonResponsibleLendNode> create(PersonResponsibleLendNodeModule module) {
    return new PersonResponsibleLendNodeModule_ProvidePersonResponsibleLendNodeFactory(module);
  }

  /** Proxies {@link PersonResponsibleLendNodeModule#providePersonResponsibleLendNode()}. */
  public static PersonResponsibleLendNode proxyProvidePersonResponsibleLendNode(
      PersonResponsibleLendNodeModule instance) {
    return instance.providePersonResponsibleLendNode();
  }
}
