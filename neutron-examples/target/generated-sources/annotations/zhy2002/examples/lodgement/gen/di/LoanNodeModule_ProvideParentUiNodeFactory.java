package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.ParentUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanNodeModule_ProvideParentUiNodeFactory implements Factory<ParentUiNode<?>> {
  private final LoanNodeModule module;

  public LoanNodeModule_ProvideParentUiNodeFactory(LoanNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public ParentUiNode<?> get() {
    return Preconditions.checkNotNull(
        module.provideParentUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ParentUiNode<?>> create(LoanNodeModule module) {
    return new LoanNodeModule_ProvideParentUiNodeFactory(module);
  }

  /** Proxies {@link LoanNodeModule#provideParentUiNode()}. */
  public static ParentUiNode<?> proxyProvideParentUiNode(LoanNodeModule instance) {
    return instance.provideParentUiNode();
  }
}
