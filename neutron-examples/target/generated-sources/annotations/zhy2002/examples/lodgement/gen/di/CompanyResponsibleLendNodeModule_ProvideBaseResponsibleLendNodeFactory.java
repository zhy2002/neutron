package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseResponsibleLendNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyResponsibleLendNodeModule_ProvideBaseResponsibleLendNodeFactory
    implements Factory<BaseResponsibleLendNode<?>> {
  private final CompanyResponsibleLendNodeModule module;

  public CompanyResponsibleLendNodeModule_ProvideBaseResponsibleLendNodeFactory(
      CompanyResponsibleLendNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseResponsibleLendNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseResponsibleLendNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseResponsibleLendNode<?>> create(
      CompanyResponsibleLendNodeModule module) {
    return new CompanyResponsibleLendNodeModule_ProvideBaseResponsibleLendNodeFactory(module);
  }

  /** Proxies {@link CompanyResponsibleLendNodeModule#provideBaseResponsibleLendNode()}. */
  public static BaseResponsibleLendNode<?> proxyProvideBaseResponsibleLendNode(
      CompanyResponsibleLendNodeModule instance) {
    return instance.provideBaseResponsibleLendNode();
  }
}
