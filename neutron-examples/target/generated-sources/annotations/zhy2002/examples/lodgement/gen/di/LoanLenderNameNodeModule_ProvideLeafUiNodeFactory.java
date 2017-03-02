package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LoanLenderNameNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final LoanLenderNameNodeModule module;

  public LoanLenderNameNodeModule_ProvideLeafUiNodeFactory(LoanLenderNameNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(LoanLenderNameNodeModule module) {
    return new LoanLenderNameNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link LoanLenderNameNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(LoanLenderNameNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
