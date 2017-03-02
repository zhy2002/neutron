package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.PersonApplicantTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonApplicantTypeNodeModule_ProvidePersonApplicantTypeNodeFactory
    implements Factory<PersonApplicantTypeNode> {
  private final PersonApplicantTypeNodeModule module;

  public PersonApplicantTypeNodeModule_ProvidePersonApplicantTypeNodeFactory(
      PersonApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public PersonApplicantTypeNode get() {
    return Preconditions.checkNotNull(
        module.providePersonApplicantTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PersonApplicantTypeNode> create(PersonApplicantTypeNodeModule module) {
    return new PersonApplicantTypeNodeModule_ProvidePersonApplicantTypeNodeFactory(module);
  }

  /** Proxies {@link PersonApplicantTypeNodeModule#providePersonApplicantTypeNode()}. */
  public static PersonApplicantTypeNode proxyProvidePersonApplicantTypeNode(
      PersonApplicantTypeNodeModule instance) {
    return instance.providePersonApplicantTypeNode();
  }
}
