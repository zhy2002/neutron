package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicantTypeNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final CompanyApplicantTypeNodeModule module;

  public CompanyApplicantTypeNodeModule_ProvideLeafUiNodeFactory(
      CompanyApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(CompanyApplicantTypeNodeModule module) {
    return new CompanyApplicantTypeNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link CompanyApplicantTypeNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(CompanyApplicantTypeNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
