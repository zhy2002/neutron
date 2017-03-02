package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ObjectUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyResponsibleLendNodeModule_ProvideObjectUiNodeFactory
    implements Factory<ObjectUiNode<?>> {
  private final CompanyResponsibleLendNodeModule module;

  public CompanyResponsibleLendNodeModule_ProvideObjectUiNodeFactory(
      CompanyResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ObjectUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideObjectUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ObjectUiNode<?>> create(CompanyResponsibleLendNodeModule module) {
    return new CompanyResponsibleLendNodeModule_ProvideObjectUiNodeFactory(module);
  }

  /** Proxies {@link CompanyResponsibleLendNodeModule#provideObjectUiNode()}. */
  public static ObjectUiNode<?> proxyProvideObjectUiNode(
      CompanyResponsibleLendNodeModule instance) {
    return instance.provideObjectUiNode();
  }
}
