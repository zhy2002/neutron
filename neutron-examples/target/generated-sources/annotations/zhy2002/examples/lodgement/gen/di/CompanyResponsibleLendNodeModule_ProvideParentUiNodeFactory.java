package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyResponsibleLendNodeModule_ProvideParentUiNodeFactory
    implements Factory<ParentUiNode<?>> {
  private final CompanyResponsibleLendNodeModule module;

  public CompanyResponsibleLendNodeModule_ProvideParentUiNodeFactory(
      CompanyResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(CompanyResponsibleLendNodeModule module) {
    return new CompanyResponsibleLendNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link CompanyResponsibleLendNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(
      CompanyResponsibleLendNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
