package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseApplicantTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonApplicantTypeNodeModule_ProvideBaseApplicantTypeNodeFactory
    implements Factory<BaseApplicantTypeNode<?>> {
  private final PersonApplicantTypeNodeModule module;

  public PersonApplicantTypeNodeModule_ProvideBaseApplicantTypeNodeFactory(
      PersonApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseApplicantTypeNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseApplicantTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseApplicantTypeNode<?>> create(PersonApplicantTypeNodeModule module) {
    return new PersonApplicantTypeNodeModule_ProvideBaseApplicantTypeNodeFactory(module);
  }

  /** Proxies {@link PersonApplicantTypeNodeModule#provideBaseApplicantTypeNode()}. */
  public static BaseApplicantTypeNode<?> proxyProvideBaseApplicantTypeNode(
      PersonApplicantTypeNodeModule instance) {
    return instance.provideBaseApplicantTypeNode();
  }
}
