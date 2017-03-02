package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.UiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonApplicantTypeNodeModule_ProvideUiNodeFactory
    implements Factory<UiNode<?>> {
  private final PersonApplicantTypeNodeModule module;

  public PersonApplicantTypeNodeModule_ProvideUiNodeFactory(PersonApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UiNode<?>> create(PersonApplicantTypeNodeModule module) {
    return new PersonApplicantTypeNodeModule_ProvideUiNodeFactory(module);
  }

  /** Proxies {@link PersonApplicantTypeNodeModule#provideUiNode()}. */
  public static UiNode<?> proxyProvideUiNode(PersonApplicantTypeNodeModule instance) {
    return instance.provideUiNode();
  }
}
