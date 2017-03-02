package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseContactNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyContactNodeModule_ProvideBaseContactNodeFactory
    implements Factory<BaseContactNode<?>> {
  private final CompanyContactNodeModule module;

  public CompanyContactNodeModule_ProvideBaseContactNodeFactory(CompanyContactNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseContactNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseContactNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseContactNode<?>> create(CompanyContactNodeModule module) {
    return new CompanyContactNodeModule_ProvideBaseContactNodeFactory(module);
  }

  /** Proxies {@link CompanyContactNodeModule#provideBaseContactNode()}. */
  public static BaseContactNode<?> proxyProvideBaseContactNode(CompanyContactNodeModule instance) {
    return instance.provideBaseContactNode();
  }
}
