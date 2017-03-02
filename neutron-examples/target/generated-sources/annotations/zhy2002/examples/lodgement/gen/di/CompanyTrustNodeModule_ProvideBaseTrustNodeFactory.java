package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BaseTrustNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CompanyTrustNodeModule_ProvideBaseTrustNodeFactory
    implements Factory<BaseTrustNode<?>> {
  private final CompanyTrustNodeModule module;

  public CompanyTrustNodeModule_ProvideBaseTrustNodeFactory(CompanyTrustNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseTrustNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideBaseTrustNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseTrustNode<?>> create(CompanyTrustNodeModule module) {
    return new CompanyTrustNodeModule_ProvideBaseTrustNodeFactory(module);
  }

  /** Proxies {@link CompanyTrustNodeModule#provideBaseTrustNode()}. */
  public static BaseTrustNode<?> proxyProvideBaseTrustNode(CompanyTrustNodeModule instance) {
    return instance.provideBaseTrustNode();
  }
}
