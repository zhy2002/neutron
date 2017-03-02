package zhy2002.examples.lodgement.gen.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import zhy2002.examples.lodgement.gen.node.BeingPurchasedFlagNode;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BeingPurchasedFlagNodeModule_ProvideBeingPurchasedFlagNodeFactory
    implements Factory<BeingPurchasedFlagNode> {
  private final BeingPurchasedFlagNodeModule module;

  public BeingPurchasedFlagNodeModule_ProvideBeingPurchasedFlagNodeFactory(
      BeingPurchasedFlagNodeModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BeingPurchasedFlagNode get() {
    return Preconditions.checkNotNull(
        module.provideBeingPurchasedFlagNode(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BeingPurchasedFlagNode> create(BeingPurchasedFlagNodeModule module) {
    return new BeingPurchasedFlagNodeModule_ProvideBeingPurchasedFlagNodeFactory(module);
  }

  /** Proxies {@link BeingPurchasedFlagNodeModule#provideBeingPurchasedFlagNode()}. */
  public static BeingPurchasedFlagNode proxyProvideBeingPurchasedFlagNode(
      BeingPurchasedFlagNodeModule instance) {
    return instance.provideBeingPurchasedFlagNode();
  }
}
