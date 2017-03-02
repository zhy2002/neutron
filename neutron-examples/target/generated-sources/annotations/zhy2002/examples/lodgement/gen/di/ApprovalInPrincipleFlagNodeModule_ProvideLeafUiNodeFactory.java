package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.neutron.LeafUiNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ApprovalInPrincipleFlagNodeModule_ProvideLeafUiNodeFactory
    implements Factory<LeafUiNode<?, ?>> {
  private final ApprovalInPrincipleFlagNodeModule module;

  public ApprovalInPrincipleFlagNodeModule_ProvideLeafUiNodeFactory(
      ApprovalInPrincipleFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public LeafUiNode<?, ?> get() {
    return Preconditions.checkNotNull(
        module.provideLeafUiNode(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<LeafUiNode<?, ?>> create(ApprovalInPrincipleFlagNodeModule module) {
    return new ApprovalInPrincipleFlagNodeModule_ProvideLeafUiNodeFactory(module);
  }

  /** Proxies {@link ApprovalInPrincipleFlagNodeModule#provideLeafUiNode()}. */
  public static LeafUiNode<?, ?> proxyProvideLeafUiNode(
      ApprovalInPrincipleFlagNodeModule instance) {
    return instance.provideLeafUiNode();
  }
}
