package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonApplicantTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final PersonApplicantTypeNodeModule module;

  public PersonApplicantTypeNodeModule_ProvideLeafUiNodeFactory(
      PersonApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(PersonApplicantTypeNodeModule module) {
    return new PersonApplicantTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link PersonApplicantTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(PersonApplicantTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
