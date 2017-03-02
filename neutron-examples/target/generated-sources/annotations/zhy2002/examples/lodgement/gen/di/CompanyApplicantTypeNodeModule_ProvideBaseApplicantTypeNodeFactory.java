package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseApplicantTypeNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyApplicantTypeNodeModule_ProvideBaseApplicantTypeNodeFactory
    implements Factory<BaseApplicantTypeNode<?>> {
  private final CompanyApplicantTypeNodeModule module;

  public CompanyApplicantTypeNodeModule_ProvideBaseApplicantTypeNodeFactory(
      CompanyApplicantTypeNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseApplicantTypeNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseApplicantTypeNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseApplicantTypeNode<?>> create(CompanyApplicantTypeNodeModule module) {
    return new CompanyApplicantTypeNodeModule_ProvideBaseApplicantTypeNodeFactory(module);
  }

  /** Proxies {@link CompanyApplicantTypeNodeModule#provideBaseApplicantTypeNode()}. */
  public static BaseApplicantTypeNode<?> proxyProvideBaseApplicantTypeNode(
      CompanyApplicantTypeNodeModule instance) {
    return instance.provideBaseApplicantTypeNode();
  }
}